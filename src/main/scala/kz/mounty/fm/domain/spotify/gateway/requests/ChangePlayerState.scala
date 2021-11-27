package kz.mounty.fm.domain.spotify.gateway.requests

import kz.mounty.fm.domain.DomainEntity
import kz.mounty.fm.domain.spotify.gateway.SpotifyPlayerState

class ChangePlayerStateRequestBody(newState: SpotifyPlayerState) extends DomainEntity

class ChangePlayerStateResponseBody() extends DomainEntity
