package kz.mounty.fm.domain.requests

import kz.mounty.fm.domain.DomainEntity
import kz.mounty.fm.domain.user.UserProfile

case class GetUserProfileGatewayRequestBody(tokenKey: String) extends DomainEntity

case class GetUserProfileGatewayResponseBody(userProfile: UserProfile) extends DomainEntity
