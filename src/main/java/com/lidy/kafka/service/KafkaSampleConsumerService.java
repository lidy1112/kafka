package com.lidy.kafka.service;

import java.io.IOException;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public
class KafkaSampleConsumerService {
	@KafkaListener(topics = "test", groupId = "lidy")
	public void consume(String message) throws
		IOException {
		System.out.println("receive message : " + message);
	}
}
