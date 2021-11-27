package kz.mounty.fm.amqp.messages


object MountyMessages {
  object UserProfileCore {
    val messages = Seq(Ping.routingKey)
    case object Ping extends BaseMessage
  }
}

