package bronze;

import java.io.*;
import java.util.*;

public class No_11022 {
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int max = Integer.parseInt(br.readLine());

    for (int i = 1; i <= max; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      bw.write("Case #" + (i) + ": " + a + " + " + b + " = " + (a + b) + "\n");
    }
    bw.flush();
    bw.close();
  }

  public static void main(String[] args) throws IOException {
    solution();
  }

}
