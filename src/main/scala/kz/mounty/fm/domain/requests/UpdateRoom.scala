package kz.mounty.fm.domain.requests

import kz.mounty.fm.domain.DomainEntity

case class UpdateRoomRequestBody(id: String,
                                 title: Option[String] = None,
                                 isPrivate: Option[Boolean] = None,
                                 inviteCode: Option[String] = None,
                                 imageUrl: Option[String] = None
                                ) extends DomainEntity

case class UpdateRoomResponseBody(updated: Boolean) extends DomainEntity