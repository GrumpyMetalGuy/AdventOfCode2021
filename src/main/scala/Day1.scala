object Day1 {
        def part_1(input_vector: Vector[Int]): Int =
                input_vector.sliding(2).map { case Seq(a, b) => if (b > a) 1 else 0 }.sum

        def part_2(input_vector: Vector[Int]): Int =
                input_vector.sliding(4).map { case Seq(a, b, c, d) => if ((b + c + d) > (a + b + c)) 1 else 0 }.sum

        }
