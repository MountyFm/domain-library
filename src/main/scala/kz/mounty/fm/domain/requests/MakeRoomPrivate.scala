package kz.mounty.fm.domain.requests

import kz.mounty.fm.domain.DomainEntity

case class MakeRoomPrivateRequestBody(roomId: String, inviteCode: String) extends DomainEntity

case class MakeRoomPrivateResponseBody(inviteCode: String) extends DomainEntity
