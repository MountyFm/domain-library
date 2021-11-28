package kz.mounty.fm.domain.requests

import kz.mounty.fm.domain.DomainEntity

case class GetCurrentlyPlayingTrackRequestBody(tokenKey: String) extends DomainEntity

case class GetCurrentlyPlayingTrackResponseBody() extends DomainEntity
