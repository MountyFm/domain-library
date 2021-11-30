package kz.mounty.fm.domain.requests

import kz.mounty.fm.domain.DomainEntity
import kz.mounty.fm.domain.user.RoomUser

case class GetOrCreateRoomUserIfNotExistRequestBody(profileId: String, roomId: String) extends DomainEntity

case class GetOrCreateRoomUserIfNotExistResponseBody(roomUser: RoomUser) extends DomainEntity
