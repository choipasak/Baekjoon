package programmers.코딩_기초_트레이닝;

public class 공배수 {
  class Solution {
    public int solution(int number, int n, int m) {
      // return number % (n * m) == 0 ? 1 : 0;
      return number % n == 0 && number % m == 0 ? 1 : 0;
    }
  }
}
