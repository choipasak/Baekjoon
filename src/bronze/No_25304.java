package bronze;

import java.util.*;
import java.io.*;

public class No_25304 {
  public static String solution() throws IOException {
    // 실제 솔루션 파트. 클래스 이름은 항상 solution()이라고 지정할 것. (셀프 관례)

    // 260000
    // 4
    // 20000 5
    // 30000 2
    // 10000 6
    // 5000 8

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 이게 기본 세팅임. 입력값을 받기 위한.

    int total = Integer.parseInt(br.readLine());
    int amount = Integer.parseInt(br.readLine());
    int sum = 0; // 비교할 실제 총 합계
    for (int i = 0; i < amount; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int price = 0;
      int num = 0;
      while (st.hasMoreTokens()) {
        price = Integer.parseInt(st.nextToken());
        num = Integer.parseInt(st.nextToken());
      }
      sum += price * num;
    }

    if (total == sum) {
      return "yes";
    } else {
      return "no";
    }

  }

  public static void main(String[] args) throws IOException {
    String res = solution();
    System.out.println(res);
  }
}
