# spring-cloud-2020
2020年Spring Cloud学习



场景模拟：

当用户完成下单操作，请求地址是/order/pay，该请求被order服务所处理，order服务会调用订单服务获取用户订单地址/address/getAddress



项目介绍

eureka3001：eureka server

eureka3002：eureka server

其中eureka3001、eureka3002位eureka集群配置



order7001：order服务，注册到eureka中

order7002：order服务，注册到zookeeper中

order7003：order服务，注册到consul中

order-openfeign7004：order服务，注册到eureka中，使用open feign完成远程调用



address8001：address服务，注册到eureka中

address8002：address服务，注册到zookeeper中

address8003：address服务，注册到consu中

address-hystrix8004：address服务，使用hystrix进行熔断限流，注册到eureka中

address-sentinel8005：address服务，使用Sentinel进行熔断限流，注册到nacos中



hystrix-dashboard9999：hystrix dashboard，注册到eureka中



config9898：Spring Cloud Config配置中心，注册到eureka

config-client3344：Spring Cloud Config客户端，注册到eureka，使用dev配置

config-client3345：Spring Cloud Config客户端，注册到eureka，使用test配置

config-client3346：Spring Cloud Config客户端，注册到eureka，使用prod配置



stream-consumer8410：Spring Cloud Stream RabbitMQ，生产者，注册到eureka

stream-consumer8411：Spring Cloud Stream RabbitMQ，消费者，注册到eureka

stream-consumer8412：Spring Cloud Stream RabbitMQ，消费者，注册到eureka	



nacos-config8601：Spring Cloud Alibaba Nacos Config Client，注册到nacos











