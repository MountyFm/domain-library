package kz.mounty.fm.domain.commands

import kz.mounty.fm.domain.DomainEntity

case class PlayerNextCommandBody(tokenKey: String) extends DomainEntity

case class PlayerNextResponseBody() extends DomainEntity
