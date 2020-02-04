# DubboDemo
1.本示例代码默认使用dubbo注解方式实现服务提供和消费
2.容器在启动时，先去读取dubbo.properties文件，如果dubbo.properties文件中没有配置dubbo.spring.config 参数，则默认加载META-INF/spring下的全部Spring配置文件。具体查看SpringContainer源码
3.java.lang.IllegalStateException: Zookeeper is not connected yet!
 [DUBBO] Timeout! zookeeper server can not be connected in : 30000ms!
 这两种错误为网络问题，具体先看是否自动可以重连上，因为我的zookeeper在VM中，而且网络确实很慢，所以报出这个错误是正常的。
 如果连接不上zookeeper，还需考虑防火墙。
 4.服务可以正常提供，但是消费方无法正常调用，考虑是代码编译缓存问题，重新编译代码重试。
 5.本文提供了xml，properties和注解的相关配置
