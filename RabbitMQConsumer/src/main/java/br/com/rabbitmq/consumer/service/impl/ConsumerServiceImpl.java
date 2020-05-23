package br.com.rabbitmq.consumer.service.impl;

import org.springframework.stereotype.Service;

import br.com.rabbitmq.consumer.dto.Message;
import br.com.rabbitmq.consumer.service.ConsumerService;

@Service
public class ConsumerServiceImpl implements ConsumerService {

	@Override
	public void action(Message msg) {
		System.out.println(msg.getText());
	}
}
