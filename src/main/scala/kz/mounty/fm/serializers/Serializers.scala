package kz.mounty.fm.serializers

import kz.mounty.fm.domain.user.RoomUserType
import org.joda.time.DateTime
import org.joda.time.format.ISODateTimeFormat
import org.json4s.{CustomKeySerializer, CustomSerializer, DefaultFormats, Formats, JString}

trait Serializers {
  implicit val formats: Formats = DefaultFormats ++ Seq(
    DateTimeSerializer,
    RoomUserTypeSerializer
  )


  case object DateTimeSerializer extends CustomSerializer[DateTime] (_ => (
    {
      case JString(s) => ISODateTimeFormat.dateTime().parseDateTime(s)
    },
    {
      case d: DateTime => JString(ISODateTimeFormat.dateTime().print(d))
    }
  ))

  case object RoomUserTypeSerializer extends CustomSerializer[RoomUserType] (_ => (
    {
      case JString(s) => RoomUserType(s)
    },
    {
      case r: RoomUserType => JString(r.toString)
    }
  ))
}
