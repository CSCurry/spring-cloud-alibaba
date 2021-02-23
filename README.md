### alibaba-nacos-discovery-server
6000
### alibaba-nacos-discovery-client-common
6001
### alibaba-nacos-discovery-client-feign
6002
### alibaba-nacos-config-client
7001

### alibaba-sentinel-rate-limiting
8001


### issue
1.4.0版本 单机模式下 错误：code:503,msg:server is DOWN now, please try again later!
删除{nacos.home}/nacos/data/protocol文件夹后重新启动。


#### 服务提供方
# alibaba-nacos-discovery-server
1.pom引入Nacos注册中心：spring-cloud-starter-alibaba-nacos-discovery
2.yml配置Nacos服务地址：spring.cloud.nacos.discovery.server-addr=127.0.0.1:8848
3.启动类加注解 @EnableDiscoveryClient 开启Spring Cloud的服务注册与发现
4.启动3个实例，在Nacos服务列表可查看：
	server.port=6001
	server.port=6002
	server.port=6003
5.提供一个HTTP接口

#### 服务消费者
# alibaba-nacos-discovery-client-common
1.pom引入Nacos注册中心：spring-cloud-starter-alibaba-nacos-discovery
2.yml配置Nacos服务地址：spring.cloud.nacos.discovery.server-addr=127.0.0.1:8848
3.提供一个HTTP接口，在该接口中调用服务提供方的接口