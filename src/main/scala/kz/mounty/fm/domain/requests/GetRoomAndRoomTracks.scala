package kz.mounty.fm.domain.requests

import kz.mounty.fm.domain.DomainEntity
import kz.mounty.fm.domain.room.Room
import kz.mounty.fm.domain.track.Track

case class GetRoomAndRoomTracksRequestBody(roomId: String,
                                           limit: Option[Int] = Some(100),
                                           offset: Option[Int] = Some(0),
                                           tokenKey: String) extends DomainEntity

case class GetRoomAndRoomTracksResponseBody(room: Room, tracks: Seq[Track]) extends DomainEntity
