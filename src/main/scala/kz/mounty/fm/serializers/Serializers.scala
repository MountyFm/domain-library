package kz.mounty.fm.serializers

import kz.mounty.fm.domain.DomainEntity
import kz.mounty.fm.domain.commands.{ChangePlayerStateRequestBody, ChangePlayerStateResponseBody}
import kz.mounty.fm.domain.requests.{GetCurrentUserPlaylistsRequestBody, GetPlaylistTracksRequestBody, GetUserProfileGatewayRequestBody, GetUserProfileGatewayResponseBody}
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
        classOf[ChangePlayerStateRequestBody],
        classOf[ChangePlayerStateResponseBody],
        classOf[GetUserProfileGatewayRequestBody],
        classOf[GetUserProfileGatewayResponseBody]
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
