package kz.mounty.fm.domain.spotify.gateway

case class SpotifyTrack(id: String,
                        album: Album,
                        artists: Seq[Artist],
                        name: String,
                        `type`: String,
                        durationMs: Int)
