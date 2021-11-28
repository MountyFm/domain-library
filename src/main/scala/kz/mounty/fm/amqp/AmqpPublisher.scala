package kz.mounty.fm.amqp

import com.rabbitmq.client.{Channel, MessageProperties}
import kz.mounty.fm.amqp.messages.AMQPMessage
import org.json4s.Formats
import org.json4s.native.Serialization._

import scala.util.Try

object AmqpPublisher {
  def publish(amqpMessage: AMQPMessage,
              channel: Channel)(implicit formats: Formats): Try[Unit]= {
   Try( channel.basicPublish(
      amqpMessage.exchange,
      amqpMessage.routingKey,
      MessageProperties.TEXT_PLAIN,
      write(amqpMessage).getBytes
    ))
  }
}
