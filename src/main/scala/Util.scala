import scala.io.Source

object Util {
  def load_input_as_ints(resource_name: String): Vector[Int] =
    Source.fromInputStream(getClass.getResourceAsStream(resource_name)).getLines().map(_.toInt).toVector

  def load_input_as_strings(resource_name: String): List[String] =
    Source.fromInputStream(getClass.getResourceAsStream(resource_name)).getLines().toList
}
