package kz.mounty.fm.domain.commands

import kz.mounty.fm.domain.DomainEntity

case class PlayerPlayPrevCommandBody(tokenKey: String) extends DomainEntity

case class PlayerPlayPrevResponseBody() extends DomainEntity
