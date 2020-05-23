package br.com.rabbitmq.producer.service;

import br.com.rabbitmq.producer.dto.Message;

public interface AmqpService {
	public void sendToConsumer(Message message);

}
