package bronze;

import java.io.*;
import java.util.*;

public class No_10809 {

  public void firstSolve() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // int[] arr = new int[26];
    Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
    String str = br.readLine();
    char c = 'ㄱ';

    for (char i = 'a'; i <= 'z'; i++) {
      map.put(i, -1);
    }
    System.out.println(map.toString());
    for (int i = 0; i < str.length(); i++) {
      char now = str.charAt(i);
      if (c != now) {
        map.put(str.charAt(i), i);
        c = now;
      }
    }

    StringBuilder sb = new StringBuilder();
    map.forEach((k, v) -> {
      sb.append(v + " ");
    });
    System.out.print(sb);
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    // char[] charArr = new char[26];
    List<Character> charArr = new ArrayList<>();
    int[] arr = new int[26];
    Arrays.fill(arr, -1);

    char c = 'a';
    for (int i = 0; i < arr.length; i++) {
      charArr.add(c);
      c++;
    }

    char temp = 'z';
    for (int i = 0; i < str.length(); i++) {
      char targetChar = str.charAt(i);
      int targetIdx = charArr.indexOf(targetChar);
      char nowChar = str.charAt(i);
      // 여기서부터 처음 등장한 위치인 인덱스 값을 할당해야함
      // int idx = charArr.get(str.charAt(i));
      arr[targetIdx] = str.indexOf(nowChar); // char의 idx값 재할당.
      temp = nowChar;
    }

    StringBuilder sb = new StringBuilder();
    for (int i : arr) {
      sb.append(i + " ");
    }
    System.out.print(sb);
  }
}