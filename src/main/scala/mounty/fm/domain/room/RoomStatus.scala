package mounty.fm.domain.room

import mounty.fm.domain.CustomEnumeration

sealed trait RoomStatus

/**
 * ACTIVE        status showing that Room is active.
 * NOT_ACTIVE    status showing that Room is not active.
 */

object RoomStatus extends CustomEnumeration[RoomStatus] {

  override val values: Seq[RoomStatus] = Seq(
    ACTIVE,
    NOT_ACTIVE
  )

  case object ACTIVE extends RoomStatus

  case object NOT_ACTIVE extends RoomStatus

}
