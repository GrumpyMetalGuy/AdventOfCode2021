object Day2 {
  def part_1(input_vector: List[String]): Int =
    var depth: Int = 0
    var horizontal: Int = 0

    input_vector.map(_.split(' ')).map(_.toList).foreach {
      case "forward" :: dist => horizontal += dist.head.toInt
      case "down" :: dist => depth += dist.head.toInt
      case "up" :: dist => depth -= dist.head.toInt
    }

    depth * horizontal

  def part_2(input_vector: List[String]): Int =
    var aim: Int = 0
    var depth: Int = 0
    var horizontal: Int = 0

    input_vector.map(_.split(' ')).map(_.toList).foreach {
      case "forward" :: dist =>
        horizontal += dist.head.toInt
        depth += aim * dist.head.toInt
      case "down" :: dist => aim += dist.head.toInt
      case "up" :: dist => aim -= dist.head.toInt
    }

    depth * horizontal
}
