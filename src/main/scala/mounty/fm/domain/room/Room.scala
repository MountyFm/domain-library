package mounty.fm.domain.room

import mounty.fm.domain.DomainEntity
import org.joda.time.DateTime

/**
 * @param id          unique id of the Room.
 * @param title       title name of the Room.
 * @param genre       genre of the songs being played in the Room.
 * @param status      status of the Room (ACTIVE, NOT_ACTIVE).
 * @param isPrivate   param showing whether Room is private or not.
 * @param imageUrl    url of the avatar image of the Room.
 * @param inviteCode  the invitation code of the Room.
 * @param bannedUsers the sequence of RoomUser ids who cannot be added to the group until they are removed from this list.
 * @param createdAt   date and time when the Room was created.
 */

case class Room(id: String,
                title: String,
                genre: Option[String],
                status: RoomStatus,
                isPrivate: Boolean,
                imageUrl: String,
                inviteCode: String,
                bannedUsers: Seq[String],
                createdAt: DateTime) extends DomainEntity
