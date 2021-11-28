package kz.mounty.fm.domain.commands

import kz.mounty.fm.domain.DomainEntity
import kz.mounty.fm.domain.player.PlayerState

case class ChangePlayerStateRequestBody(state: PlayerState) extends DomainEntity

case class ChangePlayerStateResponseBody() extends DomainEntity
