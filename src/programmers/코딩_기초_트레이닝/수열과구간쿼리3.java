package programmers.코딩_기초_트레이닝;

import java.util.Arrays;

public class 수열과구간쿼리3 {
  class Solution {

    int[] replay(int[] arr, int[][] queries) {
      int[] answer = Arrays.copyOf(arr, arr.length);

      for (int[] inner : queries) {
        int a = inner[0];
        int b = inner[1];

        int temp = answer[a];
        answer[a] = answer[b];
        answer[b] = temp;
      }

      return answer;
    }

    public int[] solution(int[] arr, int[][] queries) {
      for (int i = 0; i < queries.length; i++) {
        int a = queries[i][0];
        int b = queries[i][1];

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
      }

      return arr;
    }
  }
}
