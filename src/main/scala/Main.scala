def day1(): Unit =
  val input_vector: Vector[Int] = Util.load_input_as_ints("/day1.txt")

  println(Day1.part_1(input_vector))
  println(Day1.part_2(input_vector))

def day2(): Unit =
  val input_vector = Util.load_input_as_strings("/day2.txt")

  println(Day2.part_1(input_vector))
  println(Day2.part_2(input_vector))


@main def main(): Unit =
  day2()
