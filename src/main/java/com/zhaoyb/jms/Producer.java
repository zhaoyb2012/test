package com.zhaoyb.jms;

import javax.jms.Destination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
	@Autowired
	private JmsMessagingTemplate jmsTemplate;
	
	/**
	 * 
	 * @param destination
	 * @param message
	 */
	public void sendMsg(Destination destination,final String message){
		jmsTemplate.convertAndSend(destination, message);
	}
	
	@JmsListener(destination="out.queue")
	public void consumerMessage(String text){
		System.out.println("从out.queue队列收到的回复报文为:"+text);
	}
}
