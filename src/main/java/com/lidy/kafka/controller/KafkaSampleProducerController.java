package com.lidy.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lidy.kafka.service.KafkaSampleProducerService;

@RestController
public class KafkaSampleProducerController {

	@Autowired
	private KafkaSampleProducerService kafkaSampleProducerService;

	@PostMapping(value = "/sendMessage")
	public void sendMessage(String message) {
		kafkaSampleProducerService.sendMessage(message);
	}

}
