package kz.mounty.fm.domain.spotify.gateway.requests

import kz.mounty.fm.domain.DomainEntity
import kz.mounty.fm.domain.spotify.gateway.SpotifyPlaylistItem

case class GetPlaylistTracksRequestBody(playlistId: String,
                                        limit: Option[Int],
                                        offset: Option[Int],
                                        market: Option[String] = None,
                                        tokenKey: String) extends DomainEntity

case class GetPlayListTracksResponseBody(items: Seq[SpotifyPlaylistItem])
