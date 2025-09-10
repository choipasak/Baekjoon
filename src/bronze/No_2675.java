package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_2675 {

  public void forTest() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < T; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      // int operations = Integer.parseInt(st.nextToken()); 변수명 operations는 불필요/부정확한
      // 변수명임
      int repeatCount = Integer.parseInt(st.nextToken());
      String word = st.nextToken();
      for (char c : word.toCharArray()) {
        /*
         * sb.append((c + "").repeat(operations));
         * ㄴ> 이 방식은 임시 문자열 객체를 생성함 -> 메모리 낭비
         * 메모리 낭비 하지 않고 바로 형변환
         */
        sb.append(String.valueOf(c).repeat(repeatCount));
      }
      sb.append("\n");
    }
    System.out.print(sb);
  }

  public void forBusiness() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < T; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      /*
       * StringTokenizer은 실무에서 사용하지 않음.
       * 이유1: 가독성 좋지 않음
       * 이유2: split() || 정규표현식을 더 많이 사용함.
       */
      int repeatCount = Integer.parseInt(st.nextToken());
      String word = st.nextToken();
      for (char c : word.toCharArray()) {
        /*
         * sb.append((c + "").repeat(operations));
         * [문제1]
         * sb.append((c + "") -> 상수 시간 오버헤드 발생!
         * ㄴ> c + "" 은 새로운 문자열 객체를 계속 생성함.
         * `String.valueof(char)`를 사용하는 것을 권장.
         * ㄴ> valueof()는 내부적으로 char[] 1개짜리를 생성함.
         * ㄴ> 그리고 배열을 String객체로 감싸는 방식.
         * (c + ""): toString → String 객체 생성
         * String.valueOf(c): String 객체만 생성
         * [문제2]
         * repeat()
         * ㄴ> 은 내부적으로 새로운 문자열 객체를 생성함.
         * ㄴ> 임베디드와 같은 메모리 제한이 있는 환경에서 좋지않음.(객체 생성에 메모리 사용됨)
         * [해결 방법]
         * 직접 for문을 돌려 append하는 방법이 더 안전함.
         */
        for (int j = 0; j < repeatCount; j++) {
          sb.append(String.valueOf(c));
        }
      }
      /*
       * sb.append('\n')는 sb.append("\n")보다 메모리 효율이 더 좋음
       * sb.append("\n") -> 문자열 객체
       * sb.append('\n') -> 문자 리터럴
       */

      // sb.append("\n");
      sb.append('\n');
    }
    System.out.print(sb);
  }

  public static void main(String[] args) throws IOException {
    // 코드리뷰 받기 전 코드
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < T; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int operations = Integer.parseInt(st.nextToken());
      String word = st.nextToken();
      for (char c : word.toCharArray()) {
        sb.append((c + "").repeat(operations));
      }
      sb.append("\n");
    }
    System.out.print(sb);
  }
}
