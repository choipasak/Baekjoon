package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class No_5622 {
  public void firstSolve() throws IOException {
    // char[] charArr = new char[26];
    // char c = 'a';
    // for (int i = 0; i < charArr.length; i++) {
    // charArr[i] = c;
    // c++;
    // }
    // 다이얼 데이터 생성
    Map<String, Integer> map = new HashMap<>();
    // map.put("", 1);
    map.put("ABC", 2);
    map.put("DEF", 3);
    map.put("GHI", 4);
    map.put("JKL", 5);
    map.put("MNO", 6);
    map.put("PQRS", 7);
    map.put("TUV", 8);
    map.put("WXYZ", 9);
    // map.put("", 0);

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int defaultSeconds = 2;
    int sum = 0;

    for (int i = 0; i < str.length(); i++) {
      String v = String.valueOf(str.charAt(i));
      for (Map.Entry<String, Integer> entry : map.entrySet()) {
        String key = entry.getKey();
        Integer value = entry.getValue();
        if (key.contains(v)) {
          sum += value + 1;
          break;
        }
      }
    }
    System.out.print(sum);

  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int sum = 0;

    for (int i = 0; i < str.length(); i++) {
      char value = str.charAt(i);

      if (87 <= value) {
        sum += 10;
      } else if (84 <= value && value < 87) {
        sum += 9;
      } else if (80 <= value && value < 84) {
        sum += 8;
      } else if (77 <= value && value < 80) {
        sum += 7;
      } else if (74 <= value && value < 77) {
        sum += 6;
      } else if (71 <= value && value < 74) {
        sum += 5;
      } else if (68 <= value && value < 71) {
        sum += 4;
      } else if (65 <= value && value < 68) {
        sum += 3;
      }
    }
    System.out.print(sum);
  }
}
