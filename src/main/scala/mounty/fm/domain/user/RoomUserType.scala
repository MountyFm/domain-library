package mounty.fm.domain.user

import mounty.fm.domain.CustomEnumeration

sealed trait RoomUserType

/**
 * CREATOR      - user who created a Room. Can do all the things the admins can do. Cannot be removed from the Room.
 * ADMIN        - administrator of the Room. Can create other admins, add/remove/ban users, promote user to be DJ, demote a DJ to ordinary user etc.
 * DJ           - user who can play songs in the Room.
 * ORDINARY     - ordinary user who can just chat and listen to the songs played by DJ.
 * BANNED       - user is banned from the room
 */

object RoomUserType extends CustomEnumeration[RoomUserType] {

  override val values: Seq[RoomUserType] = Seq(
    CREATOR,
    ADMIN,
    DJ,
    ORDINARY,
    BANNED
  )

  case object CREATOR extends RoomUserType

  case object ADMIN extends RoomUserType

  case object DJ extends RoomUserType

  case object ORDINARY extends RoomUserType

  case object BANNED extends RoomUserType

}