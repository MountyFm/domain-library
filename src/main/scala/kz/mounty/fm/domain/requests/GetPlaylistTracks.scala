package kz.mounty.fm.domain.requests

import kz.mounty.fm.domain.DomainEntity

case class GetPlaylistTracksRequestBody(playlistId: String,
                                        limit: Option[Int],
                                        offset: Option[Int],
                                        tokenKey: String) extends DomainEntity
