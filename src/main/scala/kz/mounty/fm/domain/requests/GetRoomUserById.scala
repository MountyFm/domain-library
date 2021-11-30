package kz.mounty.fm.domain.requests

import kz.mounty.fm.domain.DomainEntity
import kz.mounty.fm.domain.user.RoomUser

case class GetRoomUserByIdRequestBody(id: String) extends DomainEntity

case class GetRoomUserByIdResponseBody(roomUser: RoomUser) extends DomainEntity
