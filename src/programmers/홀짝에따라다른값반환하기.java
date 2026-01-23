package programmers;

public class 홀짝에따라다른값반환하기 {
  class Solution {
    public int solution(int n) {
      int answer = 0;
      while (n > 0) {
        if (n % 2 == 0) {
          answer += n * n;
          n = n - 2;
        } else {
          answer += n;
          n = n - 2;
        }
      }
      return answer;
    }
  }

  class Retry {
    public int retry(int n) {
      int answer = 0;
      boolean even = (n % 2 == 0); // 짝수면 1 홀수면 0

      for (int i = n; i > 0; i -= 2) {
        answer += even ? i * i : i;
      }

      return answer;
    }
  }
}
