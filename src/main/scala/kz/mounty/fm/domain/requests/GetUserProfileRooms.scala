package kz.mounty.fm.domain.requests

import kz.mounty.fm.domain.DomainEntity
import kz.mounty.fm.domain.room.Room
import kz.mounty.fm.domain.user.RoomUserType

case class GetUserProfileRoomsRequestBody(profileId: String, `type`: RoomUserType) extends DomainEntity

case class GetUserProfileRoomsResponseBody(rooms: Seq[Room]) extends DomainEntity
