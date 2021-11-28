package kz.mounty.fm.domain.track

import kz.mounty.fm.domain.DomainEntity

case class Track(id: String,
                 imageUrl: String,
                 artists: Seq[String],
                 name: String,
                 duration: Int) extends DomainEntity
