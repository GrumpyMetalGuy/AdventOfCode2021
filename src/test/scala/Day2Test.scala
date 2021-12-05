import org.junit.Assert.*
import org.junit.Test

class Day2Test {
  @Test def part_1_test(): Unit =
    assertEquals(150, Day2.part_1(List("forward 5", "down 5", "forward 8", "up 3", "down 8", "forward 2")))

  @Test def part_2_test(): Unit =
    assertEquals(900, Day2.part_2(List("forward 5", "down 5", "forward 8", "up 3", "down 8", "forward 2")))
}
