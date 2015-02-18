/**
 * Calculates the sum of all even number in a Fibonacci sequence from 2 up to 4000000.
 * Refactored for testing purposes.
 *
 * Created by wgnalle on 2/1/2015.
 */
public class ProjectEulerTwo {
  /**
   * Calculates the sum of all even number in a Fibonacci sequence from 2 up to 4000000 and prints out the result.
   * @param args Ignored
   */
  public static void main(String[] args) {
    long sum = calculateFib(2, 4000000);

    System.out.println("The sum of the even-valued terms is " + sum);
  }

  /**
   * Refactored code to calculate the sum of even numbers in a
   * fibonacci sequence given start and stop values.
   *
   * @param start Value to start counting from.
   * @param stop Value to stop counting.
   * @return The total sum of all even numbers in a Fibonacci sequence between <code>start</code> and <code>stop</code>
   */
  public static long calculateFib(long start, long stop) {

    long sum = 0;
    long curFib = 1;
    long prevFib = 0;
    long i = start;

    while (i < stop) {
      System.out.printf("i = %d\n", i);

      if (i % 2 == 0) {
        sum += i;
      }
      prevFib = curFib;
      curFib = i;
      i += prevFib;

    }

    return sum;
  }
}
