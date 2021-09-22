package ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Dillon Wu
 * @Description: 自定义Ribbon负载均衡策略
 * @date 2021/9/20 16:42
 */
//@Configuration
public class RibbonRandomRuleConfig {

    //方法
    @Bean
    public IRule iRule(){

        return new RandomRule();
    }
}
