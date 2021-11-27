package kz.mounty.fm.amqp.messages


object MountyMessages {
  object UserProfileCore {
    case object Ping extends BaseMessage

    case object CreateUserProfileRequest extends BaseMessage

    case object UpdateUserProfileRequest extends BaseMessage

    case object DeleteUserProfileRequest extends BaseMessage

    case object GetUserProfileByIdRequest extends BaseMessage

    case object GetUserProfileRooms extends BaseMessage
  }
  object MountyApi {
    case object Pong extends BaseMessage

    case object CreateUserProfileResponse extends BaseMessage

    case object UpdateUserProfileResponse extends BaseMessage

    case object DeleteUserProfileResponse extends BaseMessage

    case object GetUserProfileByIdResponse extends BaseMessage

    case object GetUserProfileRoomsResponse extends BaseMessage

  }
}

