package com.sqs.projectname.server.dal.dao;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.sqs.projectname.server.bean.entry.TestEntry;
import com.sqs.util.BaseTestAbstact;

public class TestDaoTest extends BaseTestAbstact {

	@Autowired
	private TestDao dao;
	
	@Test
	public void testGetTestInfo() {
		int id = 1;
		TestEntry testEntry = dao.getTestInfo(id);
		assertNotNull(testEntry);
		logger.info("entry:" + JSON.toJSONString(testEntry));
	}

}
