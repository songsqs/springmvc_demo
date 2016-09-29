package com.sqs.projectname.server.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.sqs.projectname.server.common.util.RequestUtil;

/**
 * 
 * BusinessInterceptor
 * 
 * @author songqingshan
 * @date 2016年1月11日 上午10:26:46
 *
 */
public class BusinessInterceptor extends HandlerInterceptorAdapter {

    private static final Logger logger = LoggerFactory.getLogger(BusinessInterceptor.class);

    
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
            Object handler) throws Exception {
        logger.info(request.getRequestURI() + "," + RequestUtil.getIp(request)
                + ",in==========================");
        return super.preHandle(request, response, handler);
    }
    
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
            Object handler, Exception ex) throws Exception {
        logger.info(request.getRequestURI() + "," + RequestUtil.getIp(request)
                + ",out=========================");
        super.afterCompletion(request, response, handler, ex);
    }


}
