package kz.mounty.fm.exceptions

trait ErrorCode {
  val series: ErrorSeries
  val code: Int
}

trait ErrorSeries {
  val series: Int
}

object ErrorSeries {
  case object SPOTIFY_AUTH_ADAPTER extends ErrorSeries {
    override val series = 1
  }
  case object SPOTIFY_GATEWAY extends ErrorSeries {
    override val series = 2
  }
  case object USER_PROFILE_CORE extends ErrorSeries {
    override val series = 3
  }
}

object ErrorCodes {
  case class INTERNAL_SERVER_ERROR(override val series: ErrorSeries) extends ErrorCode {
    override val code = 1
  }
}
