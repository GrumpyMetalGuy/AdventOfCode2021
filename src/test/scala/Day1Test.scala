import org.junit.Test
import org.junit.Assert.*

class Day1Test {
  @Test def day1(): Unit =
    assertEquals(7, part_1(Vector(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)))

  @Test def day2(): Unit =
    assertEquals(5, part_2(Vector(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)))
}
