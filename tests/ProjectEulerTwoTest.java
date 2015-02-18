import org.junit.Test;


import static org.junit.Assert.assertEquals;

/**
 * Tests the computeFibSumOfEvens function.
 */
public class ProjectEulerTwoTest {

  /**
   * Tests the computeFibSumOfEvens function with upper bound of 10 and 20.
   * @throws Exception Computation failed.
   */
  @Test
  public void testComputeFibSumOfEvens() throws Exception {
    assertEquals("Testing upper bound of 10.", 10, ProjectEulerTwo.computeFibSumOfEvens(10));
    assertEquals("Testing upper bound of 20.", 10, ProjectEulerTwo.computeFibSumOfEvens(20));

  }
}