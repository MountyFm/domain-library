package kz.mounty.fm.amqp.messages


object MountyMessages {
  object UserProfileCore {
    case object Ping extends BaseMessage
  }
  object MountyApi {
    case object Pong extends BaseMessage
  }
}

