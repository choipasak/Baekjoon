package bronze;

import java.util.*;
import java.io.*;

public class No_25314 {

  public static void main(String[] args) throws IOException {
    // 원래 짯던 코드
    // String res = "";
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // int num = Integer.parseInt(br.readLine());
    // int value = num / 4;
    // for (int i = 0; i < value; i++) {
    // res += "long ";
    // }
    // System.out.printf("%sint", res);

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    bw.write("long ".repeat(n / 4) + "int");
    bw.flush();
  }

}
