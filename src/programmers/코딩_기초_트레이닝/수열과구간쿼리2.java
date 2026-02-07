package programmers.코딩_기초_트레이닝;

import java.util.*;

public class 수열과구간쿼리2 {
  static class Solution {
    public int[] solution(int[] arr, int[][] queries) {
      int[] answer = new int[queries.length];
      Arrays.fill(answer, -1);

      for (int i = 0; i < queries.length; i++) {
        int a = queries[i][0];
        int b = queries[i][1];
        int c = queries[i][2];
        // int MAX_VALUE = Arrays.stream(arr).max().getAsInt();
        int[] rangeArr = Arrays.copyOfRange(arr, a, b + 1);

        Arrays.sort(rangeArr);

        /*
         * 1. b랑 c가 같은 경우
         * 2. c가 제일 큰 수 이상인 경우
         * => 안되는 케이스가 더 많으니 이 부분을 if문으로 빼는게 아닌듯
         */
        // if (b == c || MAX_VALUE == c || MAX_VALUE < c) {
        // break;
        // }

        for (int j : rangeArr) {
          if (c < j) {
            answer[i] = j;
            break;
          }
        }
      }
      return answer;
    }

    public static void main(String[] args) {
      Solution s = new Solution();
      int[] arr = { 0, 1, 2, 4, 3 };
      int[][] queries = { { 0, 4, 2 }, { 0, 3, 2 }, { 0, 2, 2 } };
      s.solution(arr, queries);
    }
  }
}
