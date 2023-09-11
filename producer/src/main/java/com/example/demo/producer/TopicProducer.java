package com.example.demo.producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class TopicProducer {
	
	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;

    @Value("${topic.name.producer}")
    private String topicName;

    public void send(String message){
        log.info("Payload message : {}",  message);
        kafkaTemplate.send(topicName, message);
    }

}