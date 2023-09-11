package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.producer.TopicProducer;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {
	
	@Autowired
	private final TopicProducer topicProducer;

	@GetMapping(value = "/send/{message}")
	public void send(@PathVariable("message") String message) {
		topicProducer.send(message);
	}
}