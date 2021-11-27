package kz.mounty.fm.domain.spotify.gateway

import kz.mounty.fm.domain.CustomEnumeration

sealed trait SpotifyPlayerState

/**
 * PLAY     playing state.
 * PAUSE    paused state.
 * NEXT     switching to next song state
 * PREV     switching to prev song state
 */

object SpotifyPlayerState extends CustomEnumeration[SpotifyPlayerState] {

  override val values: Seq[SpotifyPlayerState] = Seq(
    PLAY,
    PAUSE,
    NEXT,
    PREV
  )

  case object PLAY extends SpotifyPlayerState

  case object PAUSE extends SpotifyPlayerState

  case object NEXT extends SpotifyPlayerState

  case object PREV extends SpotifyPlayerState

}