package kz.mounty.fm.domain.requests

import kz.mounty.fm.domain.DomainEntity
import kz.mounty.fm.domain.track.Track

case class GetCurrentlyPlayingTrackGatewayRequestBody(tokenKey: String) extends DomainEntity

case class GetCurrentlyPlayingTrackGatewayResponseBody(track: Track, progressMs: Int) extends DomainEntity
