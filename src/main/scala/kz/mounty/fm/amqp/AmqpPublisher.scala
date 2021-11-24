package kz.mounty.fm.amqp

import com.rabbitmq.client.{Channel, MessageProperties}
import org.json4s.Formats
import org.json4s.native.Serialization._
import org.slf4j.Logger

import scala.util.{Failure, Success, Try}

object AmqpPublisher {
  def publish(amqpMessage: AMQPMessage)
             (implicit channel: Channel,
              exchange: String,
              formats: Formats,
              log: Logger): Unit= {
   Try( channel.basicPublish(
      exchange,
      amqpMessage.routingKey,
      MessageProperties.TEXT_PLAIN,
      write(amqpMessage.message).getBytes
    )) match {
      case Success(_) => log.info(s"successfully send message $amqpMessage")
      case Failure(exception) => log.error(s"couldn't send message. Error: ${exception.getMessage}")
    }
  }
}
