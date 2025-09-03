package bronze;

import java.util.Scanner;

public class No_2525 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();

    int Total, Time;

    Total = A * 60 + B;
    Time = Total + C;

    A = (Time / 60) % 24;
    B = Time % 60;

    // if (A == 24) {
    // A = 0;
    // } else if (A > 24) {
    // A = A - 24;
    // }

    System.out.println(A + " " + B);
  }
}
