package kz.mounty.fm.domain.requests

import kz.mounty.fm.domain.DomainEntity
import kz.mounty.fm.domain.user.{RoomUser, RoomUserType}

case class GetRoomUsersRequestBody(roomId: String, `type`: Option[RoomUserType]) extends DomainEntity

case class GetRoomUsersResponseBody(roomUsers: Seq[RoomUser] = Seq.empty)
