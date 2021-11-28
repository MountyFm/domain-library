package kz.mounty.fm.repository

import org.mongodb.scala.MongoCollection
import org.mongodb.scala.bson.conversions.Bson

import scala.concurrent.{ExecutionContext, Future}

trait BaseRepository {

  def findByFilter[T: Manifest](filter: Bson)(implicit collection: MongoCollection[T]): Future[Option[T]] =
    collection
      .find(filter)
      .first()
      .headOption()

  def findAllByFilter[T: Manifest](filter: Bson)(implicit collection: MongoCollection[T]): Future[Seq[T]] =
    collection
      .find(filter)
      .collect()
      .head()

  def create[T: Manifest](entity: T)(implicit collection: MongoCollection[T], ex: ExecutionContext): Future[T] =
    collection
      .insertOne(entity)
      .head()
      .map(_ => entity)


  def all[T: Manifest](implicit collection: MongoCollection[T]): Future[Seq[T]] =
    collection
      .find()
      .collect()
      .head()


  def count[T: Manifest](implicit collection: MongoCollection[T]): Future[Long] =
    collection
      .countDocuments()
      .head()


  def updateOneByFilter[T: Manifest](filter: Bson, update: Seq[Bson])(implicit collection: MongoCollection[T], ex: ExecutionContext): Future[Boolean] =
    collection
      .updateOne(filter, update)
      .head()
      .map(res => res.wasAcknowledged())

  def deleteOneByFilter[T: Manifest](filter: Bson)(implicit collection: MongoCollection[T], ex: ExecutionContext): Future[Boolean] =
    collection
      .deleteOne(filter)
      .head()
      .map(res => res.wasAcknowledged())
}
