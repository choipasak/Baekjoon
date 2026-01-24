package programmers;

import java.util.HashSet;
import java.util.Set;

public class 주사위게임2 {
  static class Solution {
    public int solution(int a, int b, int c) {
      int answer = 1;
      int[] intArr = { a, b, c };
      Set<Integer> set = new HashSet<>();
      for (int v : intArr) {
        set.add(v);
      }
      int square = set.size();
      int T = intArr.length - square + 1;

      for (int i = 0; i < T; i++) {
        int sum = 0;
        for (int j = 0; j < intArr.length; j++) {
          sum += (int) (Math.pow(intArr[j], i + 1));
        }
        answer *= sum;
      }

      return answer;
    }

    public int solution2(int a, int b, int c) {
      int answer = 1;
      int count = 1;

      if (a == b || b == c || c == a) {
        count++;
      }
      if (a == b && b == c) {
        count++;
      }
      for (int i = 1; i <= count; i++) {
        answer *= (Math.pow(a, i) + Math.pow(b, i) + Math.pow(c, i));
      }

      return answer;
    }

  }

  public static void main(String[] args) {
    Solution s = new Solution();
    // System.out.println(s.solution(2, 6, 1));
    // System.out.println(s.solution(5, 3, 3));
    // System.out.println(s.solution(4, 4, 4));
    System.out.println(s.solution2(2, 6, 1));
    System.out.println(s.solution2(5, 3, 3));
    System.out.println(s.solution2(4, 4, 4));
  }
}
