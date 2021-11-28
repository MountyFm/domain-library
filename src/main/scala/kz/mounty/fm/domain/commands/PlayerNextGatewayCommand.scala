package kz.mounty.fm.domain.commands

import kz.mounty.fm.domain.DomainEntity

case class PlayerNextGatewayCommandBody(deviceId: Option[String], tokenKey: String) extends DomainEntity

case class PlayerNextGatewayResponseBody() extends DomainEntity
