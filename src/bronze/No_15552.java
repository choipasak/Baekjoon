package bronze;

import java.util.*;
import java.io.*;

public class No_15552 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int num = Integer.parseInt(br.readLine());
    for (int i = 0; i < num; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      while (st.hasMoreTokens()) {
        bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
      }
    }
    bw.flush();
  }

}
