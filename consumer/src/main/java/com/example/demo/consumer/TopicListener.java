package com.example.demo.consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class TopicListener {

    @KafkaListener(topics = "${topic.name.consumer}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(ConsumerRecord<String, String> payload){
        //log.info("Tópic Name: {}", topicName);
        //log.info("Partion: {}", payload.partition());
        log.info("Message: {}", payload.value());
        System.out.println("message received using kafka : "+payload.value());
    }
}