package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class No_1316 {
  public void mine() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    int count = 0;

    for (int i = 0; i < T; i++) { // 들어온 단어 개수 T만큼 돌림
      String word = br.readLine();
      ArrayList<Character> list = new ArrayList<>();
      char compare = word.charAt(0);
      for (char c : word.toCharArray()) {
        if (c != compare && list.contains(c)) {
          break;
        }
        list.add(c);
        compare = c;
      }
      if (list.size() == word.length()) {
        count++;
      }
    }
    System.out.println(count);
  }

  void better() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    int count = 0;

    for (int i = 0; i < T; i++) {
      String word = br.readLine();

      boolean[] seen = new boolean[26];
      boolean ok = true;

      char prev = word.charAt(0);
      seen[prev - 'a'] = true; // index 0의 문자인 값은 true로 설정. 첫 값 초기화 세팅

      for (int j = 1; j < word.length(); j++) { // 두번째 값부터 반복문 시작.
        char cur = word.charAt(j); // 현재 값은 j=1의 문자열의 2번째 문자.

        // 문자가 바뀌는 순간만 체크하면 된다
        if (cur != prev) {
          // 이전에 이미 나왔던 문자가 다시 나오면 그룹 단어 아님
          if (seen[cur - 'a']) { // 만약 이전의 문자가 나왔어서 true로 값이 바뀐 경우
            ok = false; //
            break;
          }
          // 이전에 해당 문자가 나오지 않았던 경우
          seen[cur - 'a'] = true;
          prev = cur;
        }
        // cur == prev인 경우(연속)는 아무 체크 없이 계속 진행 -> 검사 필요 X
      }

      if (ok)
        count++;
    }
    System.out.println(count);
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    int count = 0;

    for (int i = 0; i < T; i++) {
      String word = br.readLine();
      int[] check = new int[26]; // 영문자가 들어왔는지 확인할 배열.
      char compare = word.charAt(0); // 비교할 문자 선언

      for (int j = 1; j < word.length(); j++) { // 문자의 두번째 문자부터 중복 체크
        char now = word.charAt(j);

        if (now != compare && check[now - 'a'] > 0) {
          break;
        }
        check[now - 'a']++;
        compare = now;

        if (j == word.length() - 1) {
          count++; // 단어 1개 통과
        }
      }
    }
    System.out.println(count);
  }
}
