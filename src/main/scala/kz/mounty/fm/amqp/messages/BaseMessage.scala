package kz.mounty.fm.amqp.messages


trait BaseMessage {

  lazy val routingKey :String = camelToKebab(this.getClass.getName)

  private val separates = "[a-z](?=[A-Z])|[0-9](?=[a-zA-Z])|[A-Z](?=[A-Z][a-z])|[a-zA-Z](?=[0-9])".r

  def camelToKebab(s: String): String = separates.replaceAllIn(s, _.group(0) + '-')

    .toLowerCase
    .replace("$", ".")
    .replace("kz.mounty.fm.amqp.messages.", "")
    .dropRight(1)
}
