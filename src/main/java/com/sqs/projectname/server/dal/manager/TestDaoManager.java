package com.sqs.projectname.server.dal.manager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sqs.projectname.server.bean.entry.TestEntry;
import com.sqs.projectname.server.common.exception.ProjectException;
import com.sqs.projectname.server.common.util.RES_STATUS;
import com.sqs.projectname.server.dal.dao.TestDao;

/**
 * TestDaoManager
 * 
 * @author songqingshan
 * @date 2015年11月23日 下午4:57:55
 */
@Component
public class TestDaoManager {

	private static Logger logger = LoggerFactory.getLogger(TestDaoManager.class);

	@Autowired
	TestDao testDao;

	/**
	 * 获取test信息
	 * 
	 * @param id
	 * @return TestEntry
	 */
	public TestEntry getTestInfo(int id) {
		try {
			return testDao.getTestInfo(id);
		} catch (Exception e) {
			logger.error("db error", e);
			throw new ProjectException(RES_STATUS.SERVER_UNKONW_ERROR);
		}
	}

}
