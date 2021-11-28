package kz.mounty.fm.domain.commands

import kz.mounty.fm.domain.DomainEntity

case class NextSongCommandBody(deviceId: Option[String], tokenKey: String, roomId: String) extends DomainEntity

case class NextSongResponseBody() extends DomainEntity
