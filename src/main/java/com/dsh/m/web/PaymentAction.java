package com.dsh.m.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dsh.m.constant.Consstants;
import com.dsh.m.dao.PayAppointMapper;
import com.dsh.m.dao.PayBaseMapper;
import com.dsh.m.dao.PayPaymentMapper;
import com.dsh.m.dao.PayResultMapper;
import com.dsh.m.dao.PaySmscodeMapper;
import com.dsh.m.model.PayAppoint;
import com.dsh.m.model.PayAppointExample;
import com.dsh.m.model.PayBase;
import com.dsh.m.model.PayBaseExample;
import com.dsh.m.model.PayPayment;
import com.dsh.m.model.PayResult;
import com.dsh.m.model.PayResultExample;
import com.dsh.m.model.PaySmscode;
import com.dsh.m.util.EncriptUtil;
import com.dsh.m.util.HttpClient;
import com.dsh.m.util.ParamsUtil;
import com.infosight.open.api.utils.MD5;

@RequestMapping("/payment/payAppiont")
@Controller
public class PaymentAction extends BaseAction {
	@Autowired
	private PayAppointMapper paymentMapper;
	@Autowired
	private PayBaseMapper payBaseMapper;
	@Autowired
	private PaySmscodeMapper paySmscodeMapper;
	@Autowired
	private PayAppointMapper payAppointMapper;
	@Autowired
	private PayPaymentMapper payPaymentMapper;
	@Autowired
	private PayResultMapper payResultMapper;

	@ResponseBody
	@RequestMapping("/paySmscode")
	public String paySmscode(HttpSession session, PaySmscode paySmscode) {
		// 得到代付接口基础类
		PayBase payBase = getPayBase();
		// 获得当前登录人的id
		Integer userid = super.getUserId(session);
		paySmscode.setCustomerid(userid);
		// 将对象的的所有需要加密的字段加密
		Map<String, String> map = new HashMap<String, String>();
		Map<String, String> setSmsCodeMapParms = ParamsUtil
				.setSmsCodeMapParams(payBase, paySmscode);
		String post = HttpClient.post(Consstants.Test_InterFace_SmsCode,
				setSmsCodeMapParms);
		PaySmscode paySmscodeReturn = EncriptUtil.toJsonSmsCode(post);
		PaySmscode paySmscodeInsert = EncriptUtil.UpdateSmsCode(paySmscode,
				paySmscodeReturn);
		paySmscodeMapper.insert(paySmscodeInsert);
		return success("获取验证码成功", paySmscodeReturn);
	}

	@ResponseBody
	@RequestMapping("/payAppiont")
	public String payAppiont(HttpSession session, PayAppoint payAppoint) {
		// 得到代付接口基础类
		PayBase payBase = getPayBase();
		// 获得当前登录人的id
		Integer userid = super.getUserId(session);
		payAppoint.setCustomerid(userid);
		// 将对象的的所有需要加密的字段加密
		Map<String, String> map = new HashMap<String, String>();
		Map<String, String> setpayAppointMapParams = ParamsUtil
				.setSignMapParams(payBase, payAppoint);
		String post = HttpClient.post(Consstants.Test_InterFace_Signe,
				setpayAppointMapParams);
		PayAppoint payAppointReturn = EncriptUtil.toJsonAppiont(post);
		PayAppoint PayAppointInsert = EncriptUtil.UpdateAppiont(payAppoint,
				payAppointReturn);
		payAppointMapper.insert(PayAppointInsert);
		return success("签约成功", payAppointReturn);
	}

	@ResponseBody
	@RequestMapping("/payPayment")
	public String payPayment(HttpSession session, PayPayment payPayment) {
		// 得到代付接口基础类
		PayBase payBase = getPayBase();
		// 获取当前登录人id
		Integer userid = super.getUserId(session);
		PayAppointExample payAppointexample = new PayAppointExample();
		payAppointexample.createCriteria().andCustomeridEqualTo(userid);
		List<PayAppoint> PayPaymentList = payAppointMapper
				.selectByExample(payAppointexample);
		// 将对象的的所有需要加密的字段加密
		Map<String, String> map = new HashMap<String, String>();
		Map<String, String> setpayAppointMapParams = ParamsUtil
				.setPayByRgrNoMapParams(payBase, payPayment,
						PayPaymentList.get(0));
		String post = HttpClient.post(Consstants.Test_InterFace_Pay,
				setpayAppointMapParams);
		PayPayment payPaymentReturn = EncriptUtil.toJsonPayment(post);
		PayPayment PayPayPaymentInsert = EncriptUtil.UpdatePayPayment(
				payPayment, payPaymentReturn);
		payPaymentMapper.insert(PayPayPaymentInsert);
		return success("支付成功", payPaymentReturn);
	}

	public PayBase getPayBase() {
		PayBaseExample payBaseexample = new PayBaseExample();
		payBaseexample.createCriteria().andDrEqualTo("1");

		List<PayBase> payBase = payBaseMapper.selectByExample(payBaseexample);
		return payBase.get(0);
	}

	@RequestMapping("/payPaymentresult")
	@ResponseBody
	public Map wthdResultnotify(HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, String> map = new HashMap<String, String>();
		try {
			String charset = request.getParameter("charset");
			String mercId = request.getParameter("mercId");
			String signType = request.getParameter("signType");
			String requestId = request.getParameter("requestId");
			String interfaceName = request.getParameter("interfaceName");
			String version = request.getParameter("version");
			String orderId = request.getParameter("orderId");
			String amount = request.getParameter("amount");
			String fee = request.getParameter("fee");
			String paySts = request.getParameter("paySts");
			String payDt = request.getParameter("payDt");
			String payTime = request.getParameter("payTime");
			String hmac = request.getParameter("hmac");
			String signdata = charset + mercId + requestId + interfaceName
					+ version + signType + orderId + amount + fee + paySts
					+ payDt + payTime;
			PayResult payResult = new PayResult();
			payResult = setReturenResult(requestId, interfaceName, orderId,
					amount, fee, paySts, payDt, payTime, hmac);
			// 得到代付接口基础类
			PayBase payBase = getPayBase();
			String signStr_new = "";
			signStr_new = MD5.sign(signdata,
					"aff167ff067e4dbe999d37af0bb848f6", "UTF-8");

			map.put("mercId", mercId);
			map.put("requestId", requestId);
			map.put("interfaceName", interfaceName);
			map.put("version", version);
			map.put("signType", signType);
			map.put("orderId", orderId);
			if (signStr_new.equals(hmac)) {

				PayResultExample PayResultExample = new PayResultExample();
				PayResultExample.createCriteria().andOrderIdEqualTo(
						payResult.getOrderId());
				List<PayResult> payResultList = payResultMapper
						.selectByExample(PayResultExample);
				if (payResultList.isEmpty()) {
					map.put("returnCode", "SUCCESS");
					map.put("message", "结果通知成功");
					payResultMapper.insert(payResult);
				} else {
					map.put("returnCode", "Fail");
					map.put("message", "结果通知失败，不能重复通知");
				}

			} else {
				map.put("returnCode", "Fail");
				map.put("message", "结果通知失败，签名与请求参数不一致");
			}

		} catch (Exception e) {
			map.put("returnCode", "Fail");
			map.put("message", "结果通知失败，获取参数有误");

		}
		String signStr_new = "";
		String signStr = map.get("mercId") + map.get("requestId")
				+ map.get("interfaceName") + map.get("version")
				+ map.get("signType") + map.get("orderId")
				+ map.get("returnCode") + map.get("message");

		signStr_new = MD5.sign(signStr, "aff167ff067e4dbe999d37af0bb848f6",
				"UTF-8");
		map.put("hmac", signStr_new);
		return map;

	}

	public PayResult setReturenResult(String requestId, String interfaceName,
			String orderId, String amount, String fee, String paySts,
			String payDt, String payTime, String hmac) {
		PayResult payResult = new PayResult();
		payResult.setRequestId(requestId);
		payResult.setInterfaceName(interfaceName);
		payResult.setOrderId(orderId);
		payResult.setOrderAmt(amount);
		payResult.setFee(fee);
		payResult.setPaySts(paySts);
		payResult.setPayDt(payDt);
		payResult.setPayTime(payTime);
		payResult.setHmac(hmac);

		return payResult;

	}

}
