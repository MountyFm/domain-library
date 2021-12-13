package kz.mounty.fm.domain.commands

import kz.mounty.fm.domain.DomainEntity


case class PlaySongCommandBody(deviceId: Option[String],
                               contextUri: Option[String],
                               offset: Option[Int],
                               positionMs: Option[Int] = None,
                               tokenKey: String,
                               roomId: String) extends DomainEntity

case class PlaySongResponseBody() extends DomainEntity
