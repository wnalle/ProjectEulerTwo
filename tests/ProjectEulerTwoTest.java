import static org.junit.Assert.*;

public class ProjectEulerTwoTest {
  private ProjectEulerTwo projectEulerTwo;

  @org.junit.Before
  public void setUp() throws Exception {
    projectEulerTwo = new ProjectEulerTwo();
  }

  @org.junit.Test
  public void testCalculateFib() throws Exception {
    assertEquals(4613732, projectEulerTwo.calculateFib(2, 4000000));
  }
}