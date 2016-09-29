package com.sqs.projectname.server.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.sqs.projectname.server.bean.entry.TestEntry;
import com.sqs.util.BaseTestAbstact;

public class TestServiceImplTest extends BaseTestAbstact {

	@Autowired
	private TestService testService;
	
	@Test
	public void test() {
		int id= 1;
		TestEntry entry = testService.getTestInfo(id);
		assertNotNull(entry);
		logger.info("entry:" + JSON.toJSONString(entry));
	}

}
