package com.cloud.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Dillon Wu
 * @Description:
 *  name 指定调用rest接口所对应的服务名
 *  path 指定调用rest接口所在的StockController指定的@RequestMapping
 * @date 2021/9/20 21:17
 */
@FeignClient(name ="ali-order", path="/order")
public interface FeignOrder {

    /**
     * 声明需要调用的rest接口对应的方法
     * @return
     */
    @GetMapping("/add")
     String reduct();
}
