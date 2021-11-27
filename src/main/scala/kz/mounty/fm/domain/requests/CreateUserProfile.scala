package kz.mounty.fm.domain.requests

import kz.mounty.fm.domain.DomainEntity
import kz.mounty.fm.domain.user.UserProfile

case class CreateUserProfileRequest(userProfile: UserProfile) extends DomainEntity

case class CreateUserProfileResponse(userProfile: UserProfile) extends DomainEntity
