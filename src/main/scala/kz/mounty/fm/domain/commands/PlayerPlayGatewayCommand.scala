package kz.mounty.fm.domain.commands

import kz.mounty.fm.domain.DomainEntity

case class PlayerPlayGatewayCommandBody(deviceId: Option[String],
                                        contextUri: Option[String],
                                        offset: Option[Int],
                                        tokenKey: String) extends DomainEntity

case class PlayerPlayGatewayResponseBody() extends DomainEntity
