package programmers;

public class 조건문자열 {
  class Solution {
    public int solution(String ineq, String eq, int n, int m) {
      String sign = ineq + eq;
      boolean answer;

      switch (sign) {
        case "<=":
          answer = n <= m;
          break;
        case "<!":
          answer = n < m;
          break;
        case ">=":
          answer = n >= m;
          break;
        case ">!":
          answer = n > m;
          break;
        default:
          answer = false;
          break;
      }
      return answer ? 1 : 0;
    }
  }
}
