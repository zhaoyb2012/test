package com.zhaoyb;

import javax.jms.Destination;

import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zhaoyb.jms.Producer;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTestApplicationTests {
	
	@Autowired
	private Producer produce;

	@Test
	public void contextLoads() throws InterruptedException{
		Destination des = new ActiveMQQueue("mytest.queue");
		for(int i=0;i<100;i++){
			produce.sendMsg(des, "hello word" + i);
		}
	}

}
