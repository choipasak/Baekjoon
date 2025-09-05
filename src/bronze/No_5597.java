package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No_5597 {

  public void Mine() {
    Scanner sc = new Scanner(System.in);

    int[] arr = new int[30];
    Arrays.setAll(arr, i -> i + 1);

    for (int i = 0; i < 28; i++) {
      int num = sc.nextInt();
      arr[num - 1] = 0;
    }
    for (int i : arr) {
      if (i != 0) {
        System.out.println(i);
      }
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    boolean[] submitted = new boolean[30];

    for (int i = 0; i < 28; i++) {
      int num = Integer.parseInt(br.readLine());
      submitted[num - 1] = true;
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 30; i++) {
      if (!submitted[i]) {
        sb.append(i + 1 + "\n");
      }
    }

    System.out.println(sb);

  }
}