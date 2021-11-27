package kz.mounty.fm.domain.commands

import kz.mounty.fm.domain.DomainEntity
import kz.mounty.fm.domain.player.PlayerState

class ChangePlayerStateRequestBody(state: PlayerState) extends DomainEntity

class ChangePlayerStateResponseBody() extends DomainEntity
