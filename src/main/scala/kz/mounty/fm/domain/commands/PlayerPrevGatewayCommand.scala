package kz.mounty.fm.domain.commands

import kz.mounty.fm.domain.DomainEntity

case class PlayerPrevCommandBody(tokenKey: String) extends DomainEntity

case class PlayerPrevResponseBody() extends DomainEntity
