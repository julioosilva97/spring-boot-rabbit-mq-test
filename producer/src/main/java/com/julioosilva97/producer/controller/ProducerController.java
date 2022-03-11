package com.julioosilva97.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.julioosilva97.producer.service.RabbitMqSender;

@RestController
public class ProducerController {

	private RabbitMqSender rabbitMqSender;

	@Autowired
	public ProducerController(RabbitMqSender rabbitMqSender) {
		this.rabbitMqSender = rabbitMqSender;
	}

	@Value("${app.message}")
	private String messageReturn;

	@GetMapping(value = "/send/{msg}")
	@ResponseStatus(code = HttpStatus.OK)
	public String publishUserDetails(@PathVariable("msg") final String message) {
		rabbitMqSender.send(message);
		return messageReturn;
	}
}
