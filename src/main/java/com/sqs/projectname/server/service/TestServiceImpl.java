package com.sqs.projectname.server.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.sqs.projectname.server.bean.entry.TestEntry;
import com.sqs.projectname.server.dal.manager.TestDaoManager;

/**
 * TestServiceImpl
 *
 * @author songqingshan
 * @date 2015年11月23日 下午5:03:50
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    TestDaoManager testDaoManager;

    @Value("${sync.data.queue}")
    private String queueName;

    @Value("${sync.data.brokerURL}")
    private String brokerURL;

    private static final Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);

    /*
	 * 获取test信息
	 * 
	 * @see com.sqs.server.service.TestService#getTestInfo()
	 */
    @Override
    public TestEntry getTestInfo(int id) {
        return this.testDaoManager.getTestInfo(id);
    }

	@Override
	public JSONObject getConfig(String key) {
		logger.info("[test spring 常量注入],sync.data.queue:{},brokerURL:{}",this.queueName, this.brokerURL);
		JSONObject json = new JSONObject();
		json.put("sync.data.queue", queueName);
		json.put("sync.data.brokerURL", brokerURL);
		json.put("key", key);
		return json;
	}

}
