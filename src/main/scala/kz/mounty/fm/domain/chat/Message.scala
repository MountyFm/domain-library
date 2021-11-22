package kz.mounty.fm.domain.chat

import kz.mounty.fm.domain.DomainEntity
import org.joda.time.DateTime

/**
 * @param id            unique id of the Message.
 * @param roomId        id of the Room.
 * @param profileId     user profile id.
 * @param userName      user profile name.
 * @param userAvatarUrl user profile avatar url(optional).
 * @param messageText   text of message
 * @param createdAt     date and time when the message instance was created.
 */

case class Message(id: String,
                   roomId: String,
                   profileId: String,
                   userName: String,
                   userAvatarUrl: Option[String] = None,
                   messageText: String,
                   createdAt: DateTime) extends DomainEntity
