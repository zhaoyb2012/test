package com.zhaoyb.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author zhaoyb
 *
 */
@Component
@ConfigurationProperties(prefix="Test")
public class TestProperties {
	private String testValue;

	public String getTestValue() {
		return testValue;
	}

	public void setTestValue(String testValue) {
		this.testValue = testValue;
	}
	
	
}
