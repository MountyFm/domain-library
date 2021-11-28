package kz.mounty.fm.domain.commands

import kz.mounty.fm.domain.DomainEntity

case class PlayerPauseGatewayCommandBody(tokenKey: String) extends DomainEntity

case class PlayerPauseGatewayResponseBody() extends DomainEntity
