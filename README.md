# DubboDemo
1.本示例代码默认使用dubbo注解方式实现服务提供和消费
2.容器在启动时，先去读取dubbo.properties文件，如果dubbo.properties文件中没有配置dubbo.spring.config 参数，则默认加载META-INF/spring下的全部Spring配置文件。具体查看SpringContainer源码
3.java.lang.IllegalStateException: Zookeeper is not connected yet!
 [DUBBO] Timeout! zookeeper server can not be connected in : 30000ms!
 这两种错误为网络问题，具体先看是否自动可以重连上，因为我的zookeeper在VM中，猜测是网络慢的原因，无论是在ZK的zoo.cfg还是项目中配置dubbo注册的timeout都没有得到解决，网上有说将dubbo版本降级为2.5.6，验证后发现确实不再报错，不过2.5.6无法集成springboot注解的形式使用。
 除此之外还需考虑防火墙等因素。
 4.服务可以正常提供，但是消费方无法正常调用，或者消费方可调用，但是调用服务为空(服务未就绪)，原因都是服务提供方或消费方dubbo向VM中的Zookeeper注册失败导致。
 解决方法： 注解或者配置中 registry 中的check设置为false，表示启动时不检查zk是否存在，如此启动之后如果注册失败便会循环着重新注册。
 <dubbo:registry address="zookeeper://192.168.216.128:2181" timeout="800000" check="false"/>
 5.本文提供了xml，properties和注解的相关配置
