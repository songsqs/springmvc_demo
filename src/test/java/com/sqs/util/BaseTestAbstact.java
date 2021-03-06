package com.sqs.util;

import java.net.URL;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:test-application-context.xml"})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
public abstract class BaseTestAbstact {

	static {
		URL url = Thread.currentThread().getContextClassLoader()
				.getResource("logback.xml");
		String name = url.getFile();
		System.setProperty("logback.configurationFile", name);
	}

	protected Logger logger = LoggerFactory.getLogger(this.getClass());

}