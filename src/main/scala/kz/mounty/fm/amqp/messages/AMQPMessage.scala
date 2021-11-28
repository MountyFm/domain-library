package kz.mounty.fm.amqp.messages

import kz.mounty.fm.domain.DomainEntity

case class AMQPMessage(entity: String,
                       exchange: String,
                       routingKey: String,
                       actorPath: String)

case class PingMessage(ping: String) extends DomainEntity

case class PongMessage(pong: String) extends DomainEntity