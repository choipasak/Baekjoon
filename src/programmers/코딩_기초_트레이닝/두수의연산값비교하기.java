package programmers.코딩_기초_트레이닝;

public class 두수의연산값비교하기 {
  class Solution {
    public int solution(int a, int b) {
      // return Integer.parseInt("" + a + b) >= 2 * a * b ? Integer.parseInt("" + a +
      // b) : 2 * a * b;
      return Math.max((Integer.parseInt(String.valueOf(a) + String.valueOf(b))), 2 * a * b);
    }
  }
}