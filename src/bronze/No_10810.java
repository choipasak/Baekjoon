package bronze;

import java.io.*;
import java.util.*;

public class No_10810 {
  public static void main(String[] args) throws IOException {
    /*
     * 1. 줄대로 값을 받고
     * 2. 두번째 값으로 for문을 돌려서
     * 3. 줄대로 또 값을 받아, StringTokenizer로 바로 값 할당.
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int[] arr = new int[Integer.parseInt(st.nextToken())];
    int num = Integer.parseInt(st.nextToken());

    // BufferedReader/StringTokenizer 사용 -> 실패
    for (int i = 0; i < num; i++) {
      st = new StringTokenizer(br.readLine());

      int x = Integer.parseInt(st.nextToken()) - 1;
      int y = Integer.parseInt(st.nextToken()) - 1;
      int z = Integer.parseInt(st.nextToken());

      while (x <= y) {
        arr[x] = z;
        x++;
      }
    }

    // Scanner 사용
    // for (int i = 0; i < num; i++) {
    // int x = sc.nextInt() - 1;
    // int y = sc.nextInt() - 1;
    // int z = sc.nextInt();

    // while (x <= y) {
    // arr[x] = z;
    // x++;
    // }
    // }

    for (int i : arr) {
      System.out.print(i + " ");
    }

  }
}
