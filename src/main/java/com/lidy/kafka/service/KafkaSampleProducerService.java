package com.lidy.kafka.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
public class KafkaSampleProducerService {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void sendMessage(String message) {
		System.out.println("send message : " + message);
		this.kafkaTemplate.send("test", message);
	}

	public void sendForm(HashMap hashMap) {
		System.out.println("send form : " + hashMap.toString());
		this.kafkaTemplate.send("test", String.valueOf(hashMap));
	}
}
