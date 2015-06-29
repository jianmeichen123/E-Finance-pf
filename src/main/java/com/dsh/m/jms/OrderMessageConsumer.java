package com.dsh.m.jms;

import java.util.Date;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

import jodd.datetime.JDateTime;

import org.apache.activemq.command.ActiveMQTextMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dsh.m.service.OrderService;

@Component
public class OrderMessageConsumer implements MessageListener {
	
	@Autowired
	private OrderService orderService;
	
	/**
	 * type:1.创建订单同时向order_logistics和order_state表中插入变更记录
	 * type:2.确认收货同时做结算操作
	 */
	@Override
	public void onMessage(Message message) {
		ActiveMQTextMessage tm = (ActiveMQTextMessage)message;
		try {
			JSONObject json = JSON.parseObject(tm.getText());
			int type = json.getIntValue("type");
			JSONObject data = json.getJSONObject("data");
			switch(type) {
			case 1:
				orderService.aftercreate(data);
				break;
			case 2:
				orderService.afterconfirm(data);
				break;
			}
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Date start = new JDateTime().setHour(0).setMinute(0).setSecond(0, 0).convertToDate();
		Date end = new JDateTime(start).addDay(7).convertToDate();
		System.out.println(start+"\r\n"+end);
	}

}
