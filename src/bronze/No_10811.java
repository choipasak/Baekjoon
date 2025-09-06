package bronze;

import java.io.*;
import java.util.*;

public class No_10811 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int[] bucket = new int[Integer.parseInt(st.nextToken())];
    Arrays.setAll(bucket, i -> i + 1);
    int count = Integer.parseInt(st.nextToken());

    for (int i = 0; i < count; i++) {
      st = new StringTokenizer(br.readLine());
      int start = Integer.parseInt(st.nextToken()) - 1;
      int end = Integer.parseInt(st.nextToken()) - 1;

      while (start < end) {
        int temp = bucket[start];
        bucket[start++] = bucket[end];
        bucket[end--] = temp;
      }
    }

    StringBuilder sb = new StringBuilder();
    for (int i : bucket) {
      sb.append(i + " ");
    }

    System.out.println(sb);
  }
}
