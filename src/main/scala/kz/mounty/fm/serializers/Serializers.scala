package kz.mounty.fm.serializers

import kz.mounty.fm.domain.DomainEntity
import kz.mounty.fm.domain.spotify.gateway.{Album, Artist, Image, SpotifyPlaylist, SpotifyPlaylistItem, SpotifyTrack, SpotifyTracks}
import kz.mounty.fm.domain.spotify.gateway.requests.{ChangePlayerStateRequest, ChangePlayerStateResponse, GetCurrentUserPlaylistsRequestBody, GetCurrentUserPlaylistsResponseBody, GetPlayListTracksResponseBody, GetPlaylistTracksRequestBody}
import org.joda.time.DateTime
import org.joda.time.format.ISODateTimeFormat
import org.json4s.jackson.Serialization
import org.json4s.{CustomSerializer, Formats, JString, ShortTypeHints}

trait Serializers {
  implicit val formats: Formats = Serialization.formats(
    ShortTypeHints(
      List(
        classOf[DomainEntity],
        classOf[SpotifyPlaylist],
        classOf[Image],
        classOf[GetCurrentUserPlaylistsRequestBody],
        classOf[GetCurrentUserPlaylistsResponseBody],
        classOf[SpotifyPlaylist],
        classOf[Album],
        classOf[Artist],
        classOf[Image],
        classOf[SpotifyPlaylist],
        classOf[SpotifyTrack],
        classOf[SpotifyTracks],
        classOf[GetPlayListTracksResponseBody],
        classOf[GetPlaylistTracksRequestBody],
        classOf[GetPlayListTracksResponseBody],
        classOf[SpotifyPlaylistItem],
        classOf[ChangePlayerStateRequest],
        classOf[ChangePlayerStateResponse]
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
