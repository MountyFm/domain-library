package kz.mounty.fm.domain.requests

import kz.mounty.fm.domain.DomainEntity

case class DeleteUserProfileRequestBody(id: String) extends DomainEntity

case class DeleteUserProfileResponseBody(deleted: Boolean) extends DomainEntity
