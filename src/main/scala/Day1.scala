import scala.io.Source

def part_1(input_vector: Vector[Int]): Int =
  input_vector.sliding(2).map { case Seq(a, b) => if (b > a) 1 else 0 }.sum

def part_2(input_vector: Vector[Int]): Int =
  input_vector.sliding(4).map { case Seq(a, b, c, d) => if ((b + c + d) > (a + b + c)) 1 else 0 }.sum

@main def day1(): Unit =
  val input_vector: Vector[Int] = Source.fromInputStream(getClass.getResourceAsStream("/day1.txt")).getLines()
    .map(_.toInt).toVector

  println(part_1(input_vector))
  println(part_2(input_vector))
