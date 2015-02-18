/**
 * Computes the sum of even valued numbers in a Fibonacci sequence.
 *
 */
public class ProjectEulerTwo {

  /**
   * Computes sum of even values in a Fibonacci sequence for values up to 4000000.
   * @param args Ignored
   */
  public static void main(String[] args) {
    long sum = computeFibSumOfEvens(4000000);
    System.out.println("The sum of the even-valued terms is " + sum);
  }

  /**
   *
   * @param upperBound The total upper bound for the Fibonacci sequence.
   * @return The sum of all even values of the sequence less than upperBound.
   */
  public static long computeFibSumOfEvens(long upperBound) {
    long curFib = 1;
    long prevFib = 0;
    long sum = 0;
    long i = 2;

    while (i < upperBound) {

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
