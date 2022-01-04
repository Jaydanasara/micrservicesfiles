package com.ram.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class SenderController {
	@Autowired
	JmsTemplate jmsTemplate;
	@PostMapping("/message")
	void SendMessage(@RequestBody String message ){
		
	
		jmsTemplate.convertAndSend("orders",message);
	}

}
