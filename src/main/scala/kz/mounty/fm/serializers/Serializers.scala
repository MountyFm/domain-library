package kz.mounty.fm.serializers

import org.joda.time.DateTime
import org.joda.time.format.ISODateTimeFormat
import org.json4s.{CustomSerializer, DefaultFormats, Formats, JString}

trait Serializers {
  implicit val formats: Formats = DefaultFormats + DateTimeSerializer

  case object DateTimeSerializer extends CustomSerializer[DateTime] (_ => (
    {
      case JString(s) => ISODateTimeFormat.dateTime().parseDateTime(s)
    },
    {
      case d: DateTime => JString(ISODateTimeFormat.dateTime().print(d))
    }
  ))
}
