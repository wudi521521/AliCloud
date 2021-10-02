package com.cloud.intercptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.LoggerFactory;

import java.util.UUID;
import java.util.logging.Logger;

/**
 * @Title: FeignAuthRequestInterceptor
 * @Description: 自定义Feign拦截器
 * @Author: Dillon Wu
 * @Date: 2021/10/2 9:55
 * @Version: 1.0
 */

public class FeignAuthRequestInterceptor implements RequestInterceptor {

    public void apply(RequestTemplate requestTemplate) {
        System.out.println("feign interceptor:"+requestTemplate.feignTarget());
        //设置header参数
        requestTemplate.header("XXXX","XXXX");
        //添加路径参数
        requestTemplate.query("id","111");
        //路径http://ali-stock/stock/add?id=111 修改为http://ali-stock/stock/1000?id=111
        //requestTemplate.uri("/1000");
        //业务逻辑
        String access_token= UUID.randomUUID().toString();
        requestTemplate.header("Authorization",access_token);
        System.out.println("+++++++++++++++++++++++++++++++++++++");

    }
}
