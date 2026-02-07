package programmers.코딩_기초_트레이닝;

public class 등차수열의특정한항만더하기 {
  static class Solution {

    public int solution(int a, int d, boolean[] included) {
      int answer = 0;
      for (int i = 0; i < included.length; i++) {
        if (included[i]) {
          answer += (a + (d * i));
        }
      }
      return answer;
    }

    public int solution2(int a, int d, boolean[] included) {
      int answer = 0;
      int value = a;

      // 공차 분리 버전
      for (boolean b : included) {
        if (b)
          answer += a;
        a += d;
      }

      return answer;
    }

  }

  public static void main(String[] args) {
    boolean[] boolArr1 = { true, false, false, true, true };
    boolean[] boolArr2 = { false, false, false, true, false, false, false };
    Solution s = new Solution();
    System.out.println(s.solution2(3, 4, boolArr1));
    System.out.println(s.solution2(7, 1, boolArr2));
  }
}
