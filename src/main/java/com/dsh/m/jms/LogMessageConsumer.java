package com.dsh.m.jms;

import java.util.Date;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

import org.apache.activemq.command.ActiveMQTextMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dsh.m.dao.SysLogMapper;
import com.dsh.m.model.SysLog;

@Component
public class LogMessageConsumer implements MessageListener {
	
	@Autowired
	private SysLogMapper sysLogMapper;
	
	@Override
	public void onMessage(Message message) {
		ActiveMQTextMessage tm = (ActiveMQTextMessage)message;
		try {
			JSONObject json = JSON.parseObject(tm.getText());
			SysLog log = new SysLog();
			log.setLoginname(json.getString("name"));
			log.setLogip(json.getString("ip"));
			log.setLogtime(new Date());
			log.setAction(json.getString("action"));
			sysLogMapper.insertSelective(log);
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

}
