package mounty.fm.domain.playlist

import mounty.fm.domain.DomainEntity
import org.joda.time.DateTime

/**
 * @param id               unique id of the Playlist.
 * @param name             name of the Playlist.
 * @param genres           genre of the songs in the playlist.
 * @param picUrl           playlist main picture url.
 * @param creatorProfileId user profile id of the creator.
 * @param isPrivate        parameter showing whether playlist is private or not.
 * @param createdAt        date and time when playlist was created.
 */

case class Playlist(id: String,
                    name: String,
                    genres: Seq[String],
                    picUrl: String,
                    creatorProfileId: String,
                    isPrivate: Boolean,
                    createdAt: DateTime) extends DomainEntity
