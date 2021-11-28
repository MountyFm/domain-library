package kz.mounty.fm.domain.commands

import kz.mounty.fm.domain.DomainEntity

case class PlayerGetCurrentlyPlayingTrackGatewayCommandBody(tokenKey: String) extends DomainEntity

case class PlayerGetCurrentlyPlayingTrackGatewayResponseBody() extends DomainEntity
