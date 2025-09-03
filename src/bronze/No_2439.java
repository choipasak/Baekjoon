package bronze;

import java.util.*;
import java.io.*;

public class No_2439 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());

    for (int i = 0; i < n; i++) {
      bw.write(" ".repeat(n - (i + 1)) + "*".repeat(i + 1) + "\n");
    }
    bw.flush();
    bw.close();
  }
}
