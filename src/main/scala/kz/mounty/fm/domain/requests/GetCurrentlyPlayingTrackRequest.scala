package kz.mounty.fm.domain.requests

import kz.mounty.fm.domain.DomainEntity
import kz.mounty.fm.domain.track.Track

case class GetCurrentlyPlayingTrackRequestBody(tokenKey: String) extends DomainEntity

case class GetCurrentlyPlayingTrackResponseBody(track: Track) extends DomainEntity
