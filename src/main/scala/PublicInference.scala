import play.api.libs.json._

final case class Id[A](value: String) {
  def asString: String = value
}

object Id {
  implicit def format[A]: Format[Id[A]] = Json.format[Id[A]]
}

final case class Entity(id: Id[Entity])

object Entity {
  implicit val format: Format[Entity] = Json.format[Entity]
}
