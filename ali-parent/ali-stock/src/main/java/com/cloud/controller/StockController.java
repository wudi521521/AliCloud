package com.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dillon Wu
 * @Description:
 * @date 2021/9/17 10:27
 */
@RestController
@RequestMapping("/stock")
public class StockController {



    @GetMapping("/reduct")
    public String reduct(){
        System.out.println("扣减库存");
              return "扣减库存成功";
    }
}
