# spring-cloud-consul

### 基于springboot 2.2.4 springcloud Hoxton.SR1 使用了 consul 和 openfeign 做了一个学习demo
# 运行当前demo的要求
* 本机需要启动 consul 开发模式 
```
consul agent -dev
```
# 短短的集成，给我的的感觉
* 只是使用服务发现注册功能类似于 eureka
* eureka可以使用 openfeign的接口直接调用，而 consul 只能使用 RestTemplate
* 其他特征暂无明显对比
* 总体上看，我更愿意使用 eureka

# 参考文档
* [hashicorp-consul](https://learn.hashicorp.com/consul/getting-started/install.html)
* [consul](https://www.consul.io/docs/agent/basics.html)
* [spring-cloud-consul](https://cloud.spring.io/spring-cloud-consul/reference/html)
