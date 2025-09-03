package bronze;

import java.io.*;
import java.util.*;

public class No_2562 {
  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int[] arr = new int[9];
    // int[] M = { 0, 0 };

    // for (int i = 0; i < arr.length; i++) {
    // arr[i] = sc.nextInt();
    // if (M[0] < arr[i]) {
    // M[0] = arr[i];
    // M[1] = i + 1;
    // }
    // }

    // System.out.println(M[0] + "\n" + M[1]);

    ////////////////////////////////////////////

    Scanner sc = new Scanner(System.in);
    int maxValue = Integer.MIN_VALUE;
    int maxIndex = 0;

    for (int i = 0; i < 9; i++) {
      int n = sc.nextInt();
      if (maxValue < n) {
        maxValue = n;
        maxIndex = i + 1;
      }
    }

    System.out.println(maxValue);
    System.out.println(maxIndex);

  }
}
