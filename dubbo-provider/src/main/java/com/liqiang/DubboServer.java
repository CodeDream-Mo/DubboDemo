package com.liqiang;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboServer {
    public static void main(String[] args) {
        /**
         * dubbo.xml
         * dubbo_annotation.xml
         */
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:dubbo_annotation.xml");
        context.start();

        System.out.println("-----dubbo开启-----");

//        System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟

    }
}
