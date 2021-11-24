package kz.mounty.fm.amqp

import com.rabbitmq.client.AMQP.Queue
import com.rabbitmq.client.{Channel, Connection, ConnectionFactory}

import scala.util.{Failure, Success, Try}


object RabbitMQConnection {
  def rabbitMQConnection(username: String,
                         password: String,
                         host: String,
                         port: Int,
                         virtualHost: String): Connection = {
    val factory = new ConnectionFactory()
    factory.setUsername(username)
    factory.setPassword(password)
    factory.setVirtualHost(virtualHost)
    factory.setHost(host)
    factory.setPort(port)

    factory.newConnection()
  }

  def declareAndBindQueue(channel: Channel,
                          queueName: String,
                          exchangeName: String,
                          routingKey: String): Try[Queue.BindOk] ={
    Try(
      channel.queueDeclare(
        queueName,
        true,
        true,
        true,
        new java.util.HashMap[String, AnyRef]
      )
    ) match {
      case Success(_) => Try(channel.queueBind(queueName, exchangeName, routingKey))
      case Failure(exception) =>
        Failure(exception)
    }
  }
}
