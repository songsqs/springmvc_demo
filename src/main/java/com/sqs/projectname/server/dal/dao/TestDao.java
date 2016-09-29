package com.sqs.projectname.server.dal.dao;

import org.apache.ibatis.annotations.Param;

import com.sqs.projectname.server.bean.entry.TestEntry;

/**
 * TestDao
 * 
 * @author songqingshan
 * @date 2015年11月23日 下午4:54:18
 */
@MyBatisRepository
public interface TestDao {

	/**
	 * 获取test信息
	 * 
	 * @param id
	 * @return
	 */
	public TestEntry getTestInfo(@Param("id") int id);

}
