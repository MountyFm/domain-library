package kz.mounty.fm.amqp

import akka.event.LoggingAdapter
import com.rabbitmq.client.{Channel, MessageProperties}
import kz.mounty.fm.amqp.messages.AMQPMessage
import org.json4s.Formats
import org.json4s.native.Serialization._
import org.slf4j.Logger

import scala.util.{Failure, Success, Try}

object AmqpPublisher {
  def publish(amqpMessage: AMQPMessage,
              channel: Channel,
              exchange: String)(implicit formats: Formats): Try[Unit]= {
   Try( channel.basicPublish(
      exchange,
      amqpMessage.routingKey,
      MessageProperties.TEXT_PLAIN,
      write(amqpMessage).getBytes
    ))
  }
}
