package kz.mounty.fm.domain.commands

import kz.mounty.fm.domain.DomainEntity

case class PlayerNextGatewayCommandBody(tokenKey: String) extends DomainEntity

case class PlayerNextGatewayResponseBody() extends DomainEntity
