package bronze;

import java.util.*;
import java.io.*;

public class No_110021 {
  public static void solution() throws IOException {
    /*
     * Input
     * 5
     * 1 1
     * 2 3
     * 3 4
     * 9 8
     * 5 2
     * 
     * Output
     * Case #1: 2
     * Case #2: 5
     * Case #3: 7
     * Case #4: 17
     * Case #5: 7
     */

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    int count = 0;

    while (count < n) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int first = Integer.parseInt(st.nextToken());
      int second = Integer.parseInt(st.nextToken());
      bw.write("Case #" + (count + 1) + ": " + (first + second) + "\n");
      count++;
    }
    bw.flush();

  }

  public static void main(String[] args) throws IOException {
    solution();
  }

};