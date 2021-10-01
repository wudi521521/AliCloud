package com.cloud.conroller;

import com.cloud.feign.StockFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Dillon Wu
 * @Description:
 * @date 2021/9/17 9:32
 */
@RestController
@RequestMapping("/order")
public class OrderController {

     @Autowired
     StockFeignService stockFeignService;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/add")
    public String add(){
        System.out.println("下单成功");
        stockFeignService.reduct();
        return "Hello World";
    }

    @GetMapping(value = "/test")
    public String test(){
        System.out.println("-----------");
        return "test";
    }
}
