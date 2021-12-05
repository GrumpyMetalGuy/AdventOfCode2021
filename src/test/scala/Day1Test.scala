import org.junit.Test
import org.junit.Assert.*

class Day1Test {
  @Test def part_1_test(): Unit =
    assertEquals(7, Day1.part_1(Vector(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)))

  @Test def part_2_test(): Unit =
    assertEquals(5, Day1.part_2(Vector(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)))
}
