package programmers.코딩_기초_트레이닝;

public class 문자열겹쳐쓰기 {
  public String solution(String my_string, String overwrite_string, int s) {
    String answer = "";
    // answer = my_string.substring(0, s) + overwrite_string + my_string.substring(s
    // + overwrite_string.length());
    StringBuilder sb = new StringBuilder(my_string);
    sb.replace(s, s + overwrite_string.length(), overwrite_string);
    answer = sb.toString();
    return answer;
  }

  // public static void main(String[] args) {
  // 문자열겹쳐쓰기 call = new 문자열겹쳐쓰기();
  // String answer = call.solution(null, null, 0);
  // System.out.println(answer);
  // }
}
