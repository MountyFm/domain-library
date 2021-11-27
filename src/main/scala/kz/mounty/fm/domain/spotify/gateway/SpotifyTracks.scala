package kz.mounty.fm.domain.spotify.gateway

case class SpotifyTracks(items: Seq[SpotifyTrack] = Seq.empty,
                         total: Int,
                         limit: Option[Int],
                         offset: Option[Int])
