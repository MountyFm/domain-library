package kz.mounty.fm.domain.requests

import kz.mounty.fm.domain.DomainEntity
import kz.mounty.fm.domain.room.Room

case class GetCurrentUserRoomsGatewayRequestBody(limit: Option[Int],
                                                 offset: Option[Int],
                                                 tokenKey: String) extends DomainEntity

case class GetCurrentUserRoomsGatewayResponseBody(userId: String, rooms: Seq[Room] = Seq.empty) extends DomainEntity