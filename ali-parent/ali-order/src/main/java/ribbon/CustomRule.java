package ribbon;

import com.alibaba.nacos.client.naming.utils.ThreadLocalRandom;
import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;

/**
 * @author Dillon Wu
 * @Description: 自定义Ribbon负载均衡
 * @date 2021/9/20 17:07
 */
/*public class CustomRule extends AbstractLoadBalancerRule {
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    public Server choose(Object key) {
        //获取当前请求服务的实例
        ILoadBalancer loadBalancer = this.getLoadBalancer();
        //获取多个实例
        List<Server> reachableServers = loadBalancer.getReachableServers();

        int random = ThreadLocalRandom.current().nextInt(reachableServers.size());

        //随机获取实例
        Server server = reachableServers.get(random);
        *//*if (server.isAlive()){
            return server;
        }*//*

        return server;
    }
}*/
