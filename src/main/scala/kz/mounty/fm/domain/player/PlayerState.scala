package kz.mounty.fm.domain.player

import kz.mounty.fm.domain.CustomEnumeration

sealed trait PlayerState

object PlayerState extends CustomEnumeration[PlayerState] {

  override val values: Seq[PlayerState] = Seq(
    PLAY,
    PAUSE,
    NEXT,
    PREV
  )

  case object PLAY extends PlayerState

  case object PAUSE extends PlayerState

  case object NEXT extends PlayerState

  case object PREV extends PlayerState

}
