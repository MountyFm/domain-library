package kz.mounty.fm.amqp.messages


object MountyMessages {
  object UserProfileCore {
    case object Ping extends BaseMessage

    case object CreateUserProfileRequest extends BaseMessage

    case object UpdateUserProfileRequest extends BaseMessage

    case object DeleteUserProfileRequest extends BaseMessage

    case object GetUserProfileByIdRequest extends BaseMessage

    case object GetUserProfileRoomsRequest extends BaseMessage

    case object GetUserProfileGatewayResponse extends BaseMessage
  }

  object MountyApi {
    case object Error extends BaseMessage

    case object Pong extends BaseMessage

    case object CreateUserProfileResponse extends BaseMessage

    case object UpdateUserProfileResponse extends BaseMessage

    case object DeleteUserProfileResponse extends BaseMessage

    case object GetUserProfileByIdResponse extends BaseMessage

    case object GetUserProfileRoomsResponse extends BaseMessage

    case object PlayNextTrackResponse extends BaseMessage

    case object PlayPrevTrackResponse extends BaseMessage

    case object PauseSongResponse extends BaseMessage

    case object PlaySongResponse extends BaseMessage

    case object GetCurrentUserRoomsResponse extends BaseMessage

    case object GetRoomsForExploreResponse extends BaseMessage

    case object GetRoomsAndRoomTracksResponse extends BaseMessage

    case object GetRoomByInviteCodeResponse extends BaseMessage

    case object UpdateRoomResponse extends BaseMessage

    case object GetRoomUsersResponse extends BaseMessage

    case object GetRoomUserByIdResponse extends BaseMessage

    case object UpdateRoomUserResponse extends BaseMessage

    case object GetOrCreateRoomUserIfNotExistResponse extends BaseMessage
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

    case object GetCurrentUserRoomsRequest extends BaseMessage

    case object GetCurrentUserRoomsGatewayResponse extends BaseMessage

    case object GetPlaylistTracksGatewayResponse extends BaseMessage

    case object PlayerPlayGatewayResponse extends BaseMessage

    case object PlayerPauseGatewayResponse extends BaseMessage

    case object PlayerNextGatewayResponse extends BaseMessage

    case object PlayerPrevGatewayResponse extends BaseMessage

    case object GetCurrentlyPlayingTrackGatewayResponse extends BaseMessage

    case object GetRoomsForExploreRequest extends BaseMessage

    case object GetRoomsAndRoomTracksRequest extends BaseMessage

    case object GetRoomByInviteCodeRequest extends BaseMessage

    case object UpdateRoomRequest extends BaseMessage

    case object GetRoomUserByIdRequest extends BaseMessage

    case object UpdateRoomUserRequest extends BaseMessage

    case object GetOrCreateRoomUserIfNotExistRequest extends BaseMessage
  }

  object SpotifyGateway {
    case object GetCurrentUserRoomsGatewayRequest extends BaseMessage

    case object GetUserProfileGatewayRequest extends BaseMessage

    case object GetPlaylistTracksGatewayRequest extends BaseMessage

    case object PlayerPlayGatewayCommand extends BaseMessage

    case object PlayerPauseGatewayCommand extends BaseMessage

    case object PlayerNextGatewayCommand extends BaseMessage

    case object PlayerPrevGatewayCommand extends BaseMessage

    case object GetCurrentlyPlayingTrackGatewayRequest extends BaseMessage

  }
}

