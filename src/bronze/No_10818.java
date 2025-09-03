package bronze;

import java.io.*;
import java.util.*;

public class No_10818 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];

    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    System.out.print(Arrays.stream(arr).min().getAsInt() + " " + Arrays.stream(arr).max().getAsInt());
  }
}
