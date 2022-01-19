package com.cicd.cicdjenkinsdemo;

import com.cicd.cicdjenkinsdemo.controller.SmsController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CicdJenkinsDemoApplicationTests {

	@Autowired
	private SmsController controller;

	@Test
	void contextLoads() {
	}

}
