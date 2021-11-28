package kz.mounty.fm.domain.commands

import kz.mounty.fm.domain.DomainEntity

case class PlayerPauseGatewayCommandBody(deviceId: Option[String], tokenKey: String) extends DomainEntity

case class PlayerPauseGatewayResponseBody() extends DomainEntity
