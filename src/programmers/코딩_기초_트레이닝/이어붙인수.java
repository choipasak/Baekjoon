package programmers.코딩_기초_트레이닝;

public class 이어붙인수 {
  static class Solution {
    public int solution(int[] num_list) {

      StringBuilder sb1 = new StringBuilder();
      StringBuilder sb2 = new StringBuilder();

      for (int i : num_list) {
        if (i % 2 == 0) {
          sb1.append(i);
        } else {
          sb2.append(i);
        }
      }
      return Integer.parseInt(sb1.toString()) + Integer.parseInt(sb2.toString());
    }

    public int solution2(int[] num_list) {
      StringBuilder sbEven = new StringBuilder();
      StringBuilder sbOdd = new StringBuilder();

      for (int i : num_list) {
        if ((i & 1) == 0)
          sbEven.append(i);
        else
          sbOdd.append(i);
      }

      int even = Integer.parseInt(sbEven.toString()) == 0 ? 0 : Integer.parseInt(sbEven.toString());
      int odd = Integer.parseInt(sbOdd.toString()) == 0 ? 0 : Integer.parseInt(sbOdd.toString());

      return even + odd;
    }

  }

  public static void main(String[] args) {
    int[] intArr = { 3, 4, 5, 2, 1 };
    int[] intArr2 = { 5, 7, 8, 3 };

    Solution s = new Solution();
    // System.out.println(s.solution(intArr));
    // System.out.println(s.solution(intArr2));
    System.out.println(s.solution2(intArr));
    System.out.println(s.solution2(intArr2));
  }
}
