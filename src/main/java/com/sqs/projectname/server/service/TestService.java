package com.sqs.projectname.server.service;

import com.alibaba.fastjson.JSONObject;
import com.sqs.projectname.server.bean.entry.TestEntry;

/**
 * TestService
 * 
 * @author songqingshan
 * @date 2015年11月23日 下午5:02:58
 */
public interface TestService {

	/**
	 * 通过id查询数据库表信息
	 * @param id
	 * @return
	 */
    public TestEntry getTestInfo(int id);

    /**
     * 通过key获取服务常量配置
     * @param key
     * @return
     */
    public JSONObject getConfig(String key);
}