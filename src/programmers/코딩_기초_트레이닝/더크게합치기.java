package programmers.코딩_기초_트레이닝;

public class 더크게합치기 {
  class Solution {
    public int solution(int a, int b) {
      int v1 = Integer.parseInt("" + a + b);
      int v2 = Integer.parseInt("" + b + a);
      return v1 > v2 ? v1 : v2;
    }
  }
}
