package kz.mounty.fm.domain.requests

import kz.mounty.fm.domain.DomainEntity
import org.joda.time.DateTime

case class UpdateUserProfileRequest(id: String,
                                    name: Option[String],
                                    email: Option[String],
                                    avatarUrl: Option[String],
                                    spotifyUri: String,
                                    createdAt: DateTime) extends DomainEntity
