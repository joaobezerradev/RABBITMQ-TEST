package br.com.rabbitmq.producer.amqp;

public interface AmqpProducer<T> {

	public void producer(T t);
}
