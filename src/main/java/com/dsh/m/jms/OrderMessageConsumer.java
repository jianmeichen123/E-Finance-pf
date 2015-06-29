package com.dsh.m.jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

import org.apache.activemq.command.ActiveMQTextMessage;
import org.springframework.stereotype.Component;

@Component
public class OrderMessageConsumer implements MessageListener {

	@Override
	public void onMessage(Message message) {
		ActiveMQTextMessage tm = (ActiveMQTextMessage)message;
		try {
			System.out.println(tm.getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

}
