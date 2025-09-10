package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class No_3003 {
  public void firstSolve() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // char[] charArr = "112228".toCharArray();
    int[] intArr = { 1, 1, 2, 2, 2, 8 };
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < intArr.length; i++) {
      int v1 = intArr[i];
      int v2 = Integer.parseInt(st.nextToken());
      sb.append(v1 - v2).append(" ");
    }
    System.out.print(sb);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = { 1, 1, 2, 2, 2, 8 };
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] - sc.nextInt() + " ");
    }
  }
}
