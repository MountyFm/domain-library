package kz.mounty.fm.amqp.messages


object MountyMessages {
  object UserProfileCore {
    case object Ping extends BaseMessage

    case object CreateUserProfileRequest extends BaseMessage

    case object UpdateUserProfileRequest extends BaseMessage

    case object DeleteUserProfileRequest extends BaseMessage

    case object GetUserProfileByIdRequest extends BaseMessage

    case object GetUserProfileRoomsRequest extends BaseMessage
  }

  object MountyApi {
    case object Error extends BaseMessage

    case object Pong extends BaseMessage

    case object CreateUserProfileResponse extends BaseMessage

    case object UpdateUserProfileResponse extends BaseMessage

    case object DeleteUserProfileResponse extends BaseMessage

    case object GetUserProfileByIdResponse extends BaseMessage

    case object GetUserProfileRoomsResponse extends BaseMessage

  }

  object RoomCore {
    case object GetRoomRequest extends BaseMessage

    case object GetRoomUsersRequest extends BaseMessage

    case object GetRoomTracksRequest extends BaseMessage

    case object GetPlayerStateRequest extends BaseMessage

    case object PlayNextTrack extends BaseMessage

    case object PlayPrevTrack extends BaseMessage

    case object PauseSong extends BaseMessage

    case object PlaySong extends BaseMessage
  }

  object SpotifyGateway {
    case object GetUserPlaylistRequest extends BaseMessage

    case object GetUserPlaylistResponse extends BaseMessage

    case object PlayerPlayGatewayCommand extends BaseMessage

    case object PlayerPlayGatewayResponse extends BaseMessage

    case object PlayerPauseGatewayCommand extends BaseMessage

    case object PlayerPauseGatewayResponse extends BaseMessage

    case object PlayerNextGatewayCommand extends BaseMessage

    case object PlayerNextGatewayResponse extends BaseMessage

    case object PlayerPrevGatewayCommand extends BaseMessage

    case object PlayerPrevGatewayResponse extends BaseMessage

    case object GetCurrentlyPlayingTrackRequest extends BaseMessage

    case object GetCurrentlyPlayingTrackResponse extends BaseMessage
  }
}

