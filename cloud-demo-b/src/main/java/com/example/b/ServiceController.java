package com.example.b;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServiceController {

    @Autowired
    private LoadBalancerClient loadBalancer;
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("services")
    public List<String> services() {
        return discoveryClient.getServices();
    }

    /**
     * 获取所有服务
     */
    @RequestMapping("instances")
    public List<ServiceInstance> instances(@RequestParam String serviceId) {
        return discoveryClient.getInstances(serviceId);
    }

    /**
     * 从所有服务中选择一个服务（轮询）
     */
    @RequestMapping("discover")
    public Object discover(@RequestParam String serviceId) {
        return loadBalancer.choose(serviceId).getUri().toString();
    }
}
