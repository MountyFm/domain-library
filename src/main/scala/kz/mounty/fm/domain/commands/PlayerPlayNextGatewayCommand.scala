package kz.mounty.fm.domain.commands

import kz.mounty.fm.domain.DomainEntity

case class PlayerPlayNextCommandBody(tokenKey: String) extends DomainEntity

case class PlayerPlayNextResponseBody() extends DomainEntity
