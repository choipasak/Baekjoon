package bronze;

import java.io.*;
import java.util.Arrays;

public class No_2941 {

  public void firstSolve() throws IOException {
    int count = 0;
    String[] strArr = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String word = br.readLine();
    int i = 0;
    while (word.length() > 2) {
      String v1 = strArr[i];
      String v2 = word.substring(0, v1.length());
      if (v1.equals(v2)) {
        word = word.substring(v2.length(), word.length());
        count++;
        i = 0;
        continue;
      }

      i++;

      if (i == strArr.length) {
        word = word.substring(1, word.length());
        i = 0;
        count++;
        continue;
      }
    }

    if (Arrays.asList(strArr).contains(word)) {
      System.out.println(count + 1);
    } else {
      System.out.println(count + word.length());
    }
  }

  public static void main(String[] args) throws IOException {
    String[] strArr = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String word = br.readLine();

    for (String s : strArr) {
      word = word.replace(s, "*");
    }
    System.out.println(word.length());
  }
}
