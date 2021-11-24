package kz.mounty.fm.amqp

import kz.mounty.fm.domain.DomainEntity

trait AMQPMessage {
  def message: DomainEntity
  def actorPath: String
}
