<<<<<<< HEAD
package com.demo.simple.send;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import java.nio.charset.StandardCharsets;

/**
 * 发送
 * 简单队列-消息生产者
 */
public class Send {
    //定义队列名称
    private final static String QUEUE_NAME = "hello";

    public static void main(String[] argv) throws Exception {
        //创建连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        //IP地址
        factory.setHost("192.168.10.104");
        //用户名称
        factory.setUsername("zyh");
        //密码
        factory.setPassword("zyh");
        //虚拟主机名称
        factory.setVirtualHost("/zyh");
        //端口
        factory.setPort(5672);
        try (//连接工厂创建连接
             Connection connection = factory.newConnection();
             //创建信道
             Channel channel = connection.createChannel()
        ) {
            /**
             * 绑定队列
             * 队列名称
             * durable、持久化
             * 排查队列
             *
             */
            channel.queueDeclare(QUEUE_NAME, false, false, false, null);
            String message = "Hello World!";
            channel.basicPublish("", QUEUE_NAME, null, message.getBytes(StandardCharsets.UTF_8));
            System.out.println(" [x] Sent '" + message + "'");
        }
    }
=======
package com.demo.simple.send;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import java.nio.charset.StandardCharsets;

/**
 * 发送
 * 简单队列-消息生产者
 */
public class Send {
    //定义队列名称
    private final static String QUEUE_NAME = "hello";

    public static void main(String[] argv) throws Exception {
        //创建连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        //IP地址
        factory.setHost("192.168.10.104");
        //用户名称
        factory.setUsername("zyh");
        //密码
        factory.setPassword("zyh");
        //虚拟主机名称
        factory.setVirtualHost("/zyh");
        //端口
        factory.setPort(5672);
        try (//连接工厂创建连接
             Connection connection = factory.newConnection();
             //创建信道
             Channel channel = connection.createChannel()
        ) {
            /**
             * 绑定队列
             * 队列名称
             * durable、持久化
             * 排查队列
             *
             */
            channel.queueDeclare(QUEUE_NAME, false, false, false, null);
            String message = "Hello World!";
            channel.basicPublish("", QUEUE_NAME, null, message.getBytes(StandardCharsets.UTF_8));
            System.out.println(" [x] Sent '" + message + "'");
        }
    }
>>>>>>> b228a01 (dksada)
}