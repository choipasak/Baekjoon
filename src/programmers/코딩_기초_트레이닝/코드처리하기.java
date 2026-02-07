package programmers.코딩_기초_트레이닝;

public class 코드처리하기 {
  static class Solution {
    public String solution(String code) {
      String ret = "";
      int mode = 0; // mode 0으로 초기화
      for (int i = 0; i < code.length(); i++) {
        String c = String.valueOf(code.charAt(i));
        // if (i == 0) { // mode 0/idx 0일땐 무조건 추가임.
        // ret += c;
        // }
        if (mode == 0) { // 모드 0일때
          if ((!c.equals("1")) && i % 2 == 0) { // 1이 아니고 짝수일때만
            ret += c;
          }
          if (c.equals("1")) { // 1일때만
            mode = 1;
          }
        } else { // 모드 1일때
          if ((!c.equals("1")) && i % 2 == 1) { // 1이 아니고 홀수일때만
            ret += c;
          }
          if (c.equals("1")) { // 1일때만
            mode = 0;
          }
        }
      }
      return ret.length() == 0 ? "EMPTY" : ret;
    }

    public String solution2(String code) {
      StringBuilder sb = new StringBuilder();
      int mode = 0;
      for (int i = 0; i < code.length(); i++) {
        char c = code.charAt(i);
        if (c == '1') {
          mode ^= 1;
        } else if (i % 2 == mode) {
          sb.append(c);
        }
      }
      return sb.length() == 0 ? "EMPTY" : sb.toString();
    }

    public static void main(String[] args) {
      Solution s = new Solution();
      System.out.println(s.solution2("abc1abc1abc"));

    }
  }
}