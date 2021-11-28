package kz.mounty.fm.domain.requests

import kz.mounty.fm.domain.DomainEntity

case class UpdateUserProfileRequestBody(id: String,
                                    name: Option[String],
                                    email: Option[String],
                                    avatarUrl: Option[String],
                                    spotifyUri: Option[String]) extends DomainEntity

case class UpdateUserProfileResponseBody(updated: Boolean) extends DomainEntity
