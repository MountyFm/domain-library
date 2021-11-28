package kz.mounty.fm.domain.commands

import kz.mounty.fm.domain.DomainEntity

case class PrevSongCommandBody(deviceId: Option[String], tokenKey: String, roomId: String) extends DomainEntity

case class PrevSongResponseBody() extends DomainEntity