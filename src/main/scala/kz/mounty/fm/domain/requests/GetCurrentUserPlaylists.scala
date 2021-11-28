package kz.mounty.fm.domain.requests

import kz.mounty.fm.domain.DomainEntity
import kz.mounty.fm.domain.playlist.Playlist

case class GetCurrentUserPlaylistsRequestBody(limit: Option[Int],
                                              offset: Option[Int],
                                              tokenKey: String) extends DomainEntity

case class GetCurrentUserPlaylistsResponseBody(playlists: Seq[Playlist] = Seq.empty) extends DomainEntity