package kz.mounty.fm.domain.requests

import kz.mounty.fm.domain.DomainEntity
import kz.mounty.fm.domain.user.UserProfile

case class GetUserProfileByIdRequestBody(id: String) extends DomainEntity

case class GetUserProfileByIdResponseBody(userProfile: UserProfile) extends DomainEntity
