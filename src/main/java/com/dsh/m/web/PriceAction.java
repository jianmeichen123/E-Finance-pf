package com.dsh.m.web;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.dsh.m.dao.GoodsBclassMapper;
import com.dsh.m.dao.GoodsMapper;
import com.dsh.m.dao.GoodsPriceMapper;
import com.dsh.m.dao.GoodsSclassMapper;
import com.dsh.m.model.Goods;
import com.dsh.m.model.GoodsBclass;
import com.dsh.m.model.GoodsBclassExample;
import com.dsh.m.model.GoodsExample;
import com.dsh.m.model.GoodsPrice;
import com.dsh.m.model.GoodsPriceExample;
import com.dsh.m.model.GoodsSclass;
import com.dsh.m.model.GoodsSclassExample;

@RequestMapping("/price")
@Controller
public class PriceAction extends BaseAction {
	
	@Autowired
	private GoodsBclassMapper goodsBclassMapper;
	@Autowired
	private GoodsSclassMapper goodsSclassMapper;
	@Autowired
	private GoodsMapper goodsMapper;
	@Autowired
	private GoodsPriceMapper goodsPriceMapper;
	
	@RequestMapping("/search")
	public String search(ModelMap model) {
		GoodsBclassExample bclassExample = new GoodsBclassExample();
		bclassExample.createCriteria().andBclassidNotEqualTo(28).andIsSaleEqualTo("1");
		List<GoodsBclass> bclasses = goodsBclassMapper.selectByExample(bclassExample);
		Integer bclassid = bclasses.get(0).getBclassid();
		GoodsSclassExample sclassExample = new GoodsSclassExample();
		sclassExample.createCriteria().andBclassidEqualTo(bclassid).andIsSaleEqualTo("1");
		List<GoodsSclass> sclasses = goodsSclassMapper.selectByExample(sclassExample);
		Integer sclassid = sclasses.get(0).getSclassid();
		GoodsExample goodsExample = new GoodsExample();
		goodsExample.createCriteria().andSclassidEqualTo(sclassid).andIsSaleEqualTo("1").andDrNotEqualTo("1");
		List<Goods> goods = goodsMapper.selectByExample(goodsExample);
		JSONArray array = JSON.parseArray(JSON.toJSONString(goods));
		@SuppressWarnings("rawtypes")
		Iterator iter = array.iterator();
		while(iter.hasNext()) {
			JSONObject json = (JSONObject)iter.next();
			Integer goodsid = json.getInteger("goodsid");
			GoodsPriceExample example = new GoodsPriceExample();
			example.createCriteria().andGoodsidEqualTo(goodsid);
			List<GoodsPrice> list = goodsPriceMapper.selectByExample(example);
			if(CollectionUtils.isNotEmpty(list)) {
				GoodsPrice price = list.get(0);
				json.put("price", price.getMarketprice());
			}
		}
		model.addAttribute("bclasses", bclasses);
		model.addAttribute("sclasses", sclasses);
		model.addAttribute("goods", array);
		return "price/search";
	}
	
	@SuppressWarnings("unchecked")
	@ResponseBody
	@RequestMapping("/loadsclass")
	public String loadsclass(Integer bclassid) {
		GoodsSclassExample sclassExample = new GoodsSclassExample();
		sclassExample.createCriteria().andBclassidEqualTo(bclassid).andIsSaleEqualTo("1");
		List<GoodsSclass> sclasses = goodsSclassMapper.selectByExample(sclassExample);
		Integer sclassid = sclasses.get(0).getSclassid();
		GoodsExample goodsExample = new GoodsExample();
		goodsExample.createCriteria().andSclassidEqualTo(sclassid).andIsSaleEqualTo("1").andDrNotEqualTo("1");
		List<Goods> goods = goodsMapper.selectByExample(goodsExample);
		JSONArray array = JSON.parseArray(JSON.toJSONString(goods));
		@SuppressWarnings("rawtypes")
		Iterator iter = array.iterator();
		while(iter.hasNext()) {
			JSONObject json = (JSONObject)iter.next();
			Integer goodsid = json.getInteger("goodsid");
			GoodsPriceExample example = new GoodsPriceExample();
			example.createCriteria().andGoodsidEqualTo(goodsid);
			List<GoodsPrice> list = goodsPriceMapper.selectByExample(example);
			if(CollectionUtils.isNotEmpty(list)) {
				GoodsPrice price = list.get(0);
				json.put("price", price.getMarketprice());
			}
		}
		@SuppressWarnings("rawtypes")
		Map map = new HashMap();
		map.put("sclasses", sclasses);
		map.put("goods", array);
		return success(null, map);
	}
	
	@ResponseBody
	@RequestMapping("/loadgoods")
	public String loadgoods(Integer sclassid) {
		GoodsExample goodsExample = new GoodsExample();
		goodsExample.createCriteria().andSclassidEqualTo(sclassid).andIsSaleEqualTo("1").andDrNotEqualTo("1");
		List<Goods> goods = goodsMapper.selectByExample(goodsExample);
		JSONArray array = JSON.parseArray(JSON.toJSONString(goods));
		@SuppressWarnings("rawtypes")
		Iterator iter = array.iterator();
		while(iter.hasNext()) {
			JSONObject json = (JSONObject)iter.next();
			Integer goodsid = json.getInteger("goodsid");
			GoodsPriceExample example = new GoodsPriceExample();
			example.createCriteria().andGoodsidEqualTo(goodsid);
			List<GoodsPrice> list = goodsPriceMapper.selectByExample(example);
			if(CollectionUtils.isNotEmpty(list)) {
				GoodsPrice price = list.get(0);
				json.put("price", price.getMarketprice());
			}
		}
		return success(null, array);
	}
	
	@RequestMapping("/search2")
	public String search2(String word, ModelMap model) {
		@SuppressWarnings("rawtypes")
		List goods = goodsPriceMapper.fuzzyGetGoodsWithPrice("%"+word+"%");
		model.addAttribute("goods", goods);
		return "price/search2";
	}

}
