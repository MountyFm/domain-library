package kz.mounty.fm.domain.requests

import kz.mounty.fm.domain.DomainEntity
import kz.mounty.fm.domain.user.RoomUser

case class GetCurrentRoomUserRequestBody(roomId: String, profileId: String) extends DomainEntity

case class GetCurrentRoomUserResponseBody(roomUser: RoomUser) extends DomainEntity
