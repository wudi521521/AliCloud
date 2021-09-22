package com.conroller;

import com.feign.StockFeignService;
import org.springframework.beans.factory.annotation.Autowired;
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

   // @Autowired
     //StockFeignService feignStock;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/add")
    public String add(){
        System.out.println("下单成功");
        //feignStock.reduct();
        restTemplate.getForObject("http://ali-stock/stock/reduce",String.class);
        return "Hello World";
    }
}
