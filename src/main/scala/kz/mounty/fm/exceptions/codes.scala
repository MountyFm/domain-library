package kz.mounty.fm.exceptions

trait ErrorCode {
  val series: ErrorSeries
  val code: Int
}

trait ErrorSeries {
  val series: Int
}

object ErrorSeries {
  case object AUTH_API extends ErrorSeries {
    override val series = 1
  }

  case object USER_PROFILE_CORE extends ErrorSeries {
    override val series = 2
  }
}

object ErrorCodes {
  case class INTERNAL_SERVER_ERROR(override val series: ErrorSeries) extends ErrorCode {
    override val code = 1
  }
}
