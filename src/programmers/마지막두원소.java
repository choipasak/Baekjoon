package programmers;

import java.util.Arrays;

public class 마지막두원소 {
  class Solution {
    public int[] solution(int[] num_list) {
      int[] answer = Arrays.copyOf(num_list, num_list.length + 1);

      int last = num_list[num_list.length - 1];
      int compare = num_list[num_list.length - 2];
      int value = last - compare > 0 ? last - compare : last * 2;
      answer[num_list.length] = value;

      return answer;
    }
  }
}