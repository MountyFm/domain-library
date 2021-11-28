package kz.mounty.fm.domain.requests

import kz.mounty.fm.domain.DomainEntity
import kz.mounty.fm.domain.room.Room

case class GetCurrentUserRoomsRequestBody(limit: Option[Int],
                                          offset: Option[Int],
                                          tokenKey: String) extends DomainEntity

case class GetCurrentUserRoomsResponseBody(rooms: Seq[Room] = Seq.empty) extends DomainEntity