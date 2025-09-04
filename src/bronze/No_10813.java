package bronze;

import java.io.*;
import java.util.*;

public class No_10813 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    List<Integer> list = new ArrayList<>();

    // 바구니 준비
    for (int i = 0; i < N; i++) {
      list.add(i + 1);
    }

    // swap 시도
    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());

      // 인덱스 값
      int value1 = Integer.parseInt(st.nextToken()) - 1;
      int value2 = Integer.parseInt(st.nextToken()) - 1;

      Collections.swap(list, value1, value2);
    }

    // 출력 누적
    StringBuilder sb = new StringBuilder();
    for (int i : list) {
      sb.append(i).append(" ");
    }

    // 출력
    System.out.println(sb);

  }
}
