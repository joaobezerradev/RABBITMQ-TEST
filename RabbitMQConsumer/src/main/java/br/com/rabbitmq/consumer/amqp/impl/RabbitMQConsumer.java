package br.com.rabbitmq.consumer.amqp.impl;

import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.rabbitmq.consumer.amqp.AmqpConsumer;
import br.com.rabbitmq.consumer.dto.Message;
import br.com.rabbitmq.consumer.service.ConsumerService;

@Component
public class RabbitMQConsumer implements AmqpConsumer<Message> {

	@Autowired
	private ConsumerService consumerService;

	@Override
	@RabbitListener(queues = "${spring.rabbitmq.request.routing-key.producer}")
	public void consumer(Message msg) {
		try {
			consumerService.action(msg);
		} catch (Exception e) {
			throw new AmqpRejectAndDontRequeueException(e);
		}

	}
}
