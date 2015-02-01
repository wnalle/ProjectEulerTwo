/**
 * Created by wgnalle on 2/1/2015.
 */
public class ProjectEulerTwo {
  public static void main(String[] args) {
    int sum = 2;
    int fib = 2;

    for (int i = 3; i < 4000000; i += fib) {
      if (i % 2 == 0) {
        sum += i;
      }
      fib += i;
    }

    System.out.println("The sum of the even-valued terms is " + sum);
  }
}
