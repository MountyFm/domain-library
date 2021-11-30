package kz.mounty.fm.domain.requests

import kz.mounty.fm.domain.DomainEntity
import kz.mounty.fm.domain.user.RoomUser

case class GetRoomUsersByRoomIdRequestBody(roomId: String) extends DomainEntity

case class GetRoomUsersByRoomIdResponseBody(roomUsers: Seq[RoomUser] = Seq.empty)
