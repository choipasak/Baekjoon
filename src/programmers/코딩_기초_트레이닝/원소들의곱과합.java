package programmers.코딩_기초_트레이닝;

public class 원소들의곱과합 {
  static class Solution {
    public int solution(int[] num_list) {
      int sum = 0;
      int multi = 1;

      for (int v : num_list) {
        sum += v;
        multi *= v;
      }

      return sum * sum > multi ? 1 : 0;
    }
  }

  public static void main(String[] args) {
    int[] intArr = { 3, 4, 5, 2, 1 };
    int[] intArr2 = { 5, 7, 8, 3 };

    Solution s = new Solution();
    System.out.println(s.solution(intArr));
    System.out.println(s.solution(intArr2));
  }
}
