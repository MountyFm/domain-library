package kz.mounty.fm.exceptions

sealed trait HttpStatusCode {
  def code: Int
}

object HttpStatusCodes {

  case object OK extends HttpStatusCode {
    override def code: Int = 200
  }

  case object NotFound extends HttpStatusCode {
    override def code: Int = 404
  }

  case object BadRequest extends HttpStatusCode {
    override def code: Int = 400
  }

  case object Unauthorized extends HttpStatusCode {
    override def code: Int = 401
  }

  case object Forbidden extends HttpStatusCode {
    override def code: Int = 403
  }

  case object InternalServerError extends HttpStatusCode {
    override def code: Int = 500
  }

  case object GatewayTimeout extends HttpStatusCode {
    override def code: Int = 504
  }

  case object ServiceUnavailable extends HttpStatusCode {
    override def code: Int = 503
  }

}

trait MountyException extends RuntimeException with Serializable {

  def status: HttpStatusCode

  def errorCode: ErrorCode

  def message: Option[String]

}

case class BadRequestException(override val errorCode: ErrorCode,
                               override val message: Option[String] = None) extends MountyException {
  override val status: HttpStatusCode = HttpStatusCodes.BadRequest
}

case class NotFoundException(override val errorCode: ErrorCode,
                             override val message: Option[String] = None) extends MountyException {
  override val status: HttpStatusCode = HttpStatusCodes.NotFound
}

case class ForbiddenErrorException(override val errorCode: ErrorCode,
                                   override val message: Option[String] = None) extends MountyException {
  override val status: HttpStatusCode = HttpStatusCodes.Forbidden
}

case class ServerErrorRequestException(override val errorCode: ErrorCode,
                                       override val message: Option[String] = None) extends MountyException {
  override val status: HttpStatusCode = HttpStatusCodes.InternalServerError
}

case class UnauthorizedErrorException(override val errorCode: ErrorCode,
                                      override val message: Option[String] = None) extends MountyException {
  override val status: HttpStatusCode = HttpStatusCodes.Unauthorized
}

case class GatewayTimeoutErrorException(override val errorCode: ErrorCode,
                                        override val message: Option[String] = None) extends MountyException {
  override val status: HttpStatusCode = HttpStatusCodes.GatewayTimeout
}

case class ServiceUnavailableException(override val errorCode: ErrorCode,
                                       override val message: Option[String] = None) extends MountyException {
  override val status: HttpStatusCode = HttpStatusCodes.ServiceUnavailable
}