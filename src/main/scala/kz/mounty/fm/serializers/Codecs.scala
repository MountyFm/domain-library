package kz.mounty.fm.serializers

import kz.mounty.fm.domain.user.RoomUserType
import org.bson.{BsonReader, BsonWriter}
import org.bson.codecs.{Codec, DecoderContext, EncoderContext}
import org.joda.time.DateTime

class JodaCodec() extends Codec[DateTime] {
    override def decode(bsonReader: BsonReader, decoderContext: DecoderContext): DateTime = new DateTime(bsonReader.readDateTime())
    override def encode(bsonWriter: BsonWriter, t: DateTime, encoderContext: EncoderContext): Unit = bsonWriter.writeDateTime(t.getMillis)
    override def getEncoderClass: Class[DateTime] = classOf[DateTime]
}

class RoomUserTypeCodec() extends Codec[RoomUserType] {
    override def encode(writer: BsonWriter, value: RoomUserType, encoderContext: EncoderContext): Unit = writer.writeString(value.toString)
    override def getEncoderClass: Class[RoomUserType] = classOf[RoomUserType]
    override def decode(reader: BsonReader, decoderContext: DecoderContext): RoomUserType = RoomUserType(reader.readString())
}