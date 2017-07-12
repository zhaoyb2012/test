package com.zhaoyb.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer1 {

	@JmsListener(destination="mytest.queue")
	public void receiveMsg(String text){
		System.out.println("1收到的消息内容是：" + text);
	}
}
