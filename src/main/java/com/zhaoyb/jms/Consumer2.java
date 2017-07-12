package com.zhaoyb.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
public class Consumer2 {

	@JmsListener(destination="mytest.queue")
	@SendTo("out.queue")
	public String receiveMsg(String text){
		System.out.println("2收到的消息内容是：" + text);
		return "return message: "+ text;
	}
}
