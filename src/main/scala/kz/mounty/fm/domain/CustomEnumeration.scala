package kz.mounty.fm.domain

trait CustomEnumeration[T] {

  val values: Seq[T]

  def apply(value: String): T = valueOf(value)

  def valueOf(value: String): T = values.find(_.toString == value).getOrElse(throw new RuntimeException("Value not found"))

}
