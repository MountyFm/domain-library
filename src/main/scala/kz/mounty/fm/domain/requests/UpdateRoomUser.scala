package kz.mounty.fm.domain.requests

import kz.mounty.fm.domain.DomainEntity
import kz.mounty.fm.domain.user.RoomUserType

case class UpdateRoomUserRequestBody(id: String,
                                    `type`: Option[RoomUserType] = None) extends DomainEntity

case class UpdateRoomUserResponseBody(updated: Boolean) extends DomainEntity
