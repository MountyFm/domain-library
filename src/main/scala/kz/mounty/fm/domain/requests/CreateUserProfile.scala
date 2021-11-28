package kz.mounty.fm.domain.requests

import kz.mounty.fm.domain.DomainEntity
import kz.mounty.fm.domain.user.UserProfile

case class CreateUserProfileRequestBody(tokenKey: String) extends DomainEntity

case class CreateUserProfileResponseBody(userProfile: UserProfile) extends DomainEntity
