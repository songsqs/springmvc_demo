package com.sqs.projectname.server.web;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sqs.projectname.server.bean.entry.TestEntry;
import com.sqs.projectname.server.bean.vo.Result;
import com.sqs.projectname.server.common.exception.ProjectException;
import com.sqs.projectname.server.common.util.RES_STATUS;
import com.sqs.projectname.server.common.util.RequestUtil;
import com.sqs.projectname.server.service.TestService;

/**
 * TestController
 *
 * @author songqingshan
 * @date 2015年11月23日 下午5:05:34
 */
@Controller
public class TestController {

    @Autowired
    TestService testService;
    
    private static Logger logger = LoggerFactory.getLogger(TestController.class);
    
    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index(HttpServletRequest request) {
        logger.info("test,index," + RequestUtil.getIp(request) + "," + request.getQueryString());
        return "index";
    }
    
    @RequestMapping(value = "test/show", method = RequestMethod.GET)
    @ResponseBody
    public Result<TestEntry> getTestInfo(@RequestParam(value = "id", defaultValue = "1") int id,
            HttpServletRequest request) {
        Result<TestEntry> result = new Result<TestEntry>(RES_STATUS.SUCCESS);
        TestEntry testEntry = this.testService.getTestInfo(id);
        result.setData(testEntry);
        logger.info("test,test/show," + RequestUtil.getIp(request) + "," + request.getQueryString() + ",testEntry:" + JSON.toJSONString(testEntry));
        return result;
    }

    @ResponseBody
    @RequestMapping("test")
    public Result<JSONObject> test(HttpServletRequest request) {
        Result<JSONObject> result = new Result<JSONObject>(RES_STATUS.SUCCESS);
        JSONObject json = new JSONObject();
        json.put("ip", RequestUtil.getIp(request));
        json.put("time", System.currentTimeMillis());
        result.setStatus(RES_STATUS.SUCCESS);
        result.setData(json);
        logger.info("test,test," + RequestUtil.getIp(request) + "," + request.getQueryString());
        return result;
    }

    @ResponseBody
    @RequestMapping("format")
    public Result<JSONObject> get(@RequestParam(value="n", required=true) String n) {
        throw new ProjectException(RES_STATUS.SERVER_UNKONW_ERROR);
    }

	@ResponseBody
	@RequestMapping("ping")
	public Result<String> ping() {
		Result<String> result = new Result<>();
		result.setStatus(RES_STATUS.SUCCESS);
		result.setData("pone");

		return result;
	}


}
