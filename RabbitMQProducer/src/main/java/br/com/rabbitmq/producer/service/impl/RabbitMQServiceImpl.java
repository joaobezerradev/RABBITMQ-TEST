package br.com.rabbitmq.producer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rabbitmq.producer.amqp.AmqpProducer;
import br.com.rabbitmq.producer.dto.Message;
import br.com.rabbitmq.producer.service.AmqpService;

@Service
public class RabbitMQServiceImpl implements AmqpService {

	@Autowired
	private AmqpProducer<Message> amqp;

	@Override
	public void sendToConsumer(Message message) {
		amqp.producer(message);
	}

}
