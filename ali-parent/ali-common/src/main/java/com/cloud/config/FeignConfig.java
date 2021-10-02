package com.cloud.config;

import com.cloud.intercptor.FeignAuthRequestInterceptor;
import feign.Contract;
import feign.Logger;
import feign.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @Title: FeignConfig
 * @Description: 同意配置:制定feign日志级别
 * @Author: Dillon Wu
 * @Date: 2021/10/1 21:26
 * @Version: 1.0
 * @全局配置 当使用@Configuration会将配置作用在所有的服务提供方
 * @局部配置   1:配置类 如果只想针对某一个服务进行配置，就不要加@Configuration
 *            2:配置文件
 */
//@Configuration
public class FeignConfig {
    /**
     * 日志级别
     */
    @Bean
    public Logger.Level  feignLoggerLevel(){

        return Logger.Level.FULL;
    }

    /**
     * 修改锲约配置，支持Feign原生的注解
     * @return
     */
    //@Bean
    public Contract feignContract(){
        return new Contract.Default();
    }

    /**
     * feign超时时间设置
     * @return
     */
    @Bean
    public Request.Options options(){
        return new Request.Options(5000,10000);
    }

    /**
     * 自定义拦截器
     * @return
     */
    @Bean
    public FeignAuthRequestInterceptor feignAuthRequestInterceptor(){
        return new FeignAuthRequestInterceptor();
    }


}
