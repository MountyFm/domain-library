package kz.mounty.fm.domain.requests

import kz.mounty.fm.domain.DomainEntity
import kz.mounty.fm.domain.room.Room

case class GetRoomsForExploreRequestBody(size: Int) extends DomainEntity

case class GetRoomsForExploreResponseBody(rooms: Seq[Room]) extends DomainEntity
