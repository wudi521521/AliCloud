package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


/**
 * @author Dillon Wu
 * @Description:
 * @date 2021/9/17 10:31
 */
@SpringBootApplication()
@EnableDiscoveryClient
@EnableFeignClients
public class OrderApplication {
    public static void main(String[] args) {
        //SpringApplication.run(OrderApplication.class);
        ConfigurableApplicationContext applicationContext = SpringApplication.run(OrderApplication.class,args);
        while(true){
            String userName = applicationContext.getEnvironment().getProperty("user.name");
            System.out.println("user_name:"+userName);
            try{Thread.sleep(1900);}catch (Exception e){
             //nacos客户端每10ms去注册中心进行判断,根据MD5进行判断
            }

        }


    }

   /* @Bean
    @LoadBalanced
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        RestTemplate restTemplate = builder.build();
        return restTemplate;
    }*/
   @Bean
   @LoadBalanced
   public RestTemplate getRestTemplate(){
       return new RestTemplate();
   }


}
