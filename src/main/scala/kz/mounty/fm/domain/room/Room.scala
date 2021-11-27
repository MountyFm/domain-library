package kz.mounty.fm.domain.room

import kz.mounty.fm.domain.DomainEntity
import org.joda.time.DateTime

/**
 * @param id         unique id of the Room.
 * @param title      title name of the Room.
 * @param genreIds     genre of the songs being played in the Room.
 * @param status     status of the Room (ACTIVE, NOT_ACTIVE).
 * @param isPrivate  param showing whether Room is private or not.
 * @param imageUrl   url of the avatar image of the Room.
 * @param inviteCode the invitation code of the Room.
 * @param spotifyUri spotify uri for a playlist
 * @param createdAt  date and time when the Room was created.
 */

case class Room(id: String,
                title: String,
                genreIds: Option[Seq[String]],
                status: RoomStatus,
                isPrivate: Boolean,
                imageUrl: String,
                inviteCode: String,
                spotifyUri: String,
                createdAt: DateTime) extends DomainEntity
