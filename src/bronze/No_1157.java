package bronze;

import java.io.*;
import java.util.*;

public class No_1157 {
  public void firstSolve() throws IOException {
    /*
     * 1. 입력값 받기 -> Mississipi / zZa / z / baaa
     * 2. 받은 입력값에서 중복 문자 제거
     * 3. 각 문자를 담을 int[] intArr 선언
     * 4. intArr에 각 문자 counting 값 할당.
     * 5. sorting후, 중복값 체크 -> 없으면 바로 출력 / 있으면(또 배열 크기 비교?) ? 출력
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine().toUpperCase();

    int[] count = new int[26];
    for (char c : str.toCharArray()) {
      count[c - 'A']++;
    }

    int maxValue = Arrays.stream(count).max().getAsInt();

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < count.length; i++) {
      if (count[i] == maxValue) {
        char c = (char) Integer.parseInt(String.valueOf(i + 'A'));
        // ㄴ> (i + 'A') => 이게 이미 int임. 바로 char로 형변환 시켜주면 됨.
        // char c = (char) (i + 'A');
        sb.append(c);
      }
    }

    if (sb.length() == 1) {
      System.out.println(sb);
    } else {
      System.out.print("?");
    }

  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine().toUpperCase();

    int[] count = new int[26];
    for (char c : str.toCharArray()) {
      count[c - 'A']++;
    }

    int maxValue = 0;
    char result = '?';

    for (int i = 0; i < count.length; i++) {
      if (count[i] > maxValue) {
        maxValue = count[i];
        result = (char) (i + 'A');
      } else if (count[i] == maxValue) {
        result = '?';
      }
    }

    System.out.println(result);
  }

}
