package kz.mounty.fm.domain.commands

import kz.mounty.fm.domain.DomainEntity

case class PlayerPrevGatewayCommandBody(tokenKey: String) extends DomainEntity

case class PlayerPrevGatewayResponseBody() extends DomainEntity
