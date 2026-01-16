package programmers;

import java.util.Arrays;

public class 문자리스트를문자열로변환하기 {
  class Solution {
    public String solution(String[] arr) {
      String answer = "";
      for (String str : arr) {
        answer += str;
      }
      return answer;
    }
  }
}
