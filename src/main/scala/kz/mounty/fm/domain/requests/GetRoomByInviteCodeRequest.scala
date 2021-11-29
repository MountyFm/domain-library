package kz.mounty.fm.domain.requests

import kz.mounty.fm.domain.DomainEntity
import kz.mounty.fm.domain.room.Room

case class GetRoomByInviteCodeRequestBody(inviteCode: String) extends DomainEntity

case class GetRoomByInviteCodeResponseBody(room: Room) extends DomainEntity