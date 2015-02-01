/**
 * Created by wgnalle on 2/1/2015.
 */
public class ProjectEulerTwo {
  public static void main(String[] args) {
    int sum = 0;
    int curFib = 1;
    int prevFib = 0;

    for (int i = 2; i < 4000000; ) {

      System.out.printf("i = %d\n", i);

      if (i % 2 == 0) {
        sum += i;
      }
      prevFib = curFib;
      curFib = i;
      i += prevFib;

    }

    System.out.println("The sum of the even-valued terms is " + sum);
  }
}
