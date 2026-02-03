package programmers;

public class 수조작하기2 {
  class Solution {
    public String solution(int[] numLog) {
      StringBuilder sb = new StringBuilder();
      for (int i = 1; i < numLog.length; i++) {
        int value = numLog[i] - numLog[i - 1];
        switch (value) {
          case 1:
            sb.append("w");
            break;
          case -1:
            sb.append("s");
            break;
          case 10:
            sb.append("d");
            break;
          case -10:
            sb.append("a");
            break;
          default:
            break;
        }
      }
      return sb.toString();
    }
  }
}
