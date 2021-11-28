package kz.mounty.fm.domain.requests

import kz.mounty.fm.domain.DomainEntity
import kz.mounty.fm.domain.track.Track

case class GetPlaylistTracksRequestBody(playlistId: String,
                                        limit: Option[Int],
                                        offset: Option[Int],
                                        tokenKey: String) extends DomainEntity

case class GetPlaylistTracksResponseBody(tracks: Seq[Track]) extends DomainEntity
