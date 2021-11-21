package mounty.fm.domain.user

import mounty.fm.domain.DomainEntity
import org.joda.time.DateTime

/**
 * @param id         unique id of the profile of the user.
 * @param name       full name of the user.
 * @param email      email address fo the user.
 * @param avatarUrl  url of the avatar image of the user.
 * @param spotifyUri link to the spotify account of the user.
 * @param createdAt  date and time when user profile was created.
 */

case class UserProfile(id: String,
                       name: String,
                       email: String,
                       avatarUrl: Option[String] = None,
                       spotifyUri: String,
                       createdAt: DateTime) extends DomainEntity
