package com.example.kafka;

import com.example.kafka.producer.MsgProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.annotation.PostConstruct;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class KafkaApplication {

    @Autowired
    private MsgProducer msgProducer;

    @PostConstruct
    public void init(){
        for (int i = 0; i < 10; i++) {
            //调用消息发送类中的消息发送方法
            msgProducer.sendMessage("msg" + String.valueOf(i));
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(KafkaApplication.class,args);
    }
}