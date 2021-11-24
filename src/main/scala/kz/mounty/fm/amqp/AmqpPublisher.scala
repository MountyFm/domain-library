package kz.mounty.fm.amqp

import akka.event.LoggingAdapter
import com.rabbitmq.client.{Channel, MessageProperties}
import org.json4s.Formats
import org.json4s.native.Serialization._
import org.slf4j.Logger

import scala.util.{Failure, Success, Try}

object AmqpPublisher {
  def publish(amqpMessage: AMQPMessage,
              channel: Channel,
              exchange: String,
              routingKey: String)(implicit formats: Formats, log: LoggingAdapter): Try[Unit]= {
   Try( channel.basicPublish(
      exchange,
      routingKey,
      MessageProperties.TEXT_PLAIN,
      write(amqpMessage.message).getBytes
    ))
  }
}
