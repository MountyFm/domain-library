package kz.mounty.fm.domain.commands

import kz.mounty.fm.domain.DomainEntity

case class PlayerPlayGatewayCommandBody(deviceId: Option[String], offset: Int = 0, tokenKey: String) extends DomainEntity

case class PlayerPlayGatewayResponseBody() extends DomainEntity
