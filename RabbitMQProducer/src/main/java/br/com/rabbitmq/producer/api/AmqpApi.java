package br.com.rabbitmq.producer.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.rabbitmq.producer.dto.Message;
import br.com.rabbitmq.producer.service.AmqpService;

@RestController
public class AmqpApi {

	@Autowired
	private AmqpService service;

	@PostMapping("/send")
	public ResponseEntity<Void> sendToConsumer(@RequestBody Message msg) {
		service.sendToConsumer(msg);
		return ResponseEntity.accepted().build();
	}

}
