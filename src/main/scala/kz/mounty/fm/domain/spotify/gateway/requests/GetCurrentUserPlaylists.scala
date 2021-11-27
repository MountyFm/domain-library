package kz.mounty.fm.domain.spotify.gateway.requests

import kz.mounty.fm.domain.DomainEntity
import kz.mounty.fm.domain.spotify.gateway.SpotifyPlaylist

case class GetCurrentUserPlaylistsRequestBody(limit: Option[Int],
                                              offset: Option[Int],
                                              tokenKey: String) extends DomainEntity

case class GetCurrentUserPlaylistsResponseBody(items: Seq[SpotifyPlaylist]) extends DomainEntity
