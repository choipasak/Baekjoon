package bronze;

public class Programmers_점찍기 {

  static class Solution {
    public long solution(int k, int d) {
      long answer = 0;
      int a = d / k;

      // if ((k % 2) == 0) {
      // answer = (a * a) + k;
      // } else if(a == 1){
      // answer = 3;
      // } else {
      // answer = (a * a) + 1;
      // }

      for (int i = 1; i <= a + 1; i++) {
        answer += i;
      }

      return answer;
    }
  }

  public static void main(String[] args) {
    Solution c = new Solution();
    long ans1 = c.solution(2, 4);
    long ans2 = c.solution(1, 5);
    System.out.printf("%d, %d", ans1, ans2);
  }
}
