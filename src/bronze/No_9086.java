package bronze;

import java.io.*;

public class No_9086 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int operations = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < operations; i++) {
      String word = br.readLine();
      sb.append(word.charAt(0)).append(word.charAt(word.length() - 1)).append("\n");
    }
    System.out.println(sb);
  }
}
