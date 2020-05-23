package br.com.rabbitmq.consumer.service;

import br.com.rabbitmq.consumer.dto.Message;

public interface ConsumerService {

	void action(Message msg);
}
