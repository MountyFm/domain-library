package kz.mounty.fm.domain.user

import kz.mounty.fm.domain.DomainEntity

/**
 * RoomUser - connecting element between user and room.
 *
 * @param id        unique id of the RoomUser.
 * @param profileId unique id of the profile of the user.
 * @param roomId    unique id of the room the user is being in.
 * @param `type`    title of the user in the Room (CREATOR, ADMIN, DJ, ORDINARY).
 */

case class RoomUser(id: String,
                    profileId: String,
                    roomId: String,
                    `type`: RoomUserType) extends DomainEntity
