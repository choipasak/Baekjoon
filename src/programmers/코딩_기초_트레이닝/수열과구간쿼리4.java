package programmers.코딩_기초_트레이닝;

import java.util.Arrays;

public class 수열과구간쿼리4 {
  class Solution {
    public int[] solution(int[] arr, int[][] queries) {
      /*
       * 1. 크기가 n인 배열 arr, 길이가 3인 배열을 n개 가지고 있는 queries를 입력값으로 받는다.
       * 2.queries내부의 원소인 query는 [s,e,k] 꼴이다.
       * "각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 i가 k의 배수이면 arr[i]에 1을 더합니다."
       * ㄴ> i: s와 e 사이의 원소 값을 뜻함
       * ㄴ> i의 값이 k의 배수이면 arr[i]++ 해라.
       * ㄴ> (주의) i의 값이 arr[i]값이 아닌 i 그대로의 값이 k의 배수인가를 봐야함. (아 문제 왜이래진짜)
       * 3. "위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요."
       * ㄴ> 1회차마다 바뀐 원소 값을 가진 arr을 기준으로 2번의 동작을 반복한다.
       */
      // int[] answer = Arrays.copyOf(arr, arr.length);

      for (int i = 0; i < queries.length; i++) {
        int a = queries[i][0];
        int b = queries[i][1];
        int c = queries[i][2];

        for (int j = a; j <= b; j++) {
          if (j % c == 0) {
            arr[j]++;
          }
        }
      }
      return arr;
    }
  }
}
