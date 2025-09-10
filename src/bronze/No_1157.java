package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class No_1157 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine().toUpperCase();
    Set<Character> set = new HashSet<>();
    char[] charArr = str.toCharArray();
    Arrays.sort(charArr);

    for (int i = 0; i < charArr.length; i++) {
      char first = charArr[i];
      if (first != charArr[i]) {

      }
    }
    // 1. 중복 문자 제거
    for (Character v : set) {
      set.add(v);
    }

    int[] resCount = new int[set.size()];

    // 2. 문자별 count
    for (int i = 0; i < set.size(); i++) {
      // resCount[i] = str.length() - str.replaceAll(Arrays.asList(set)., "");
    }

  }
}
