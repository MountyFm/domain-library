package kz.mounty.fm.serializers

import kz.mounty.fm.domain.DomainEntity
import kz.mounty.fm.domain.commands._
import kz.mounty.fm.domain.playlist.Playlist
import kz.mounty.fm.domain.requests._
import kz.mounty.fm.domain.track.Track
import kz.mounty.fm.exceptions.ExceptionInfo
import org.joda.time.DateTime
import org.joda.time.format.ISODateTimeFormat
import org.json4s.jackson.Serialization
import org.json4s.{CustomSerializer, Formats, JString, ShortTypeHints}

trait Serializers {
  implicit val formats: Formats = Serialization.formats(
    ShortTypeHints(
      List(
        classOf[DomainEntity],
        classOf[GetCurrentUserPlaylistsRequestBody],
        classOf[GetPlaylistTracksRequestBody],
        classOf[GetUserProfileGatewayRequestBody],
        classOf[GetUserProfileGatewayResponseBody],
        classOf[GetCurrentlyPlayingTrackRequestBody],
        classOf[GetCurrentlyPlayingTrackResponseBody],
        classOf[PlayerPauseGatewayCommandBody],
        classOf[PlayerPauseGatewayResponseBody],
        classOf[PlayerPlayGatewayCommandBody],
        classOf[PlayerNextGatewayCommandBody],
        classOf[PlayerNextGatewayResponseBody],
        classOf[PlayerPrevGatewayCommandBody],
        classOf[PlayerPrevGatewayResponseBody],
        classOf[ExceptionInfo],
        classOf[Playlist],
        classOf[GetCurrentUserPlaylistsResponseBody],
        classOf[Track]
      )
    )
  ) + new DateTimeSerializer


  class DateTimeSerializer extends CustomSerializer[DateTime] (_ => (
    {
      case JString(s) => ISODateTimeFormat.dateTime().parseDateTime(s)
    },
    {
      case d: DateTime => JString(ISODateTimeFormat.dateTime().print(d))
    }
  ))

}
