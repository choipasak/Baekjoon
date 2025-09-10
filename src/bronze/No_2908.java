package bronze;

import java.io.*;
import java.util.*;

public class No_2908 {
  public void forTest() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int firstValue = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
    int secondValue = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

    System.out.print(Math.max(firstValue, secondValue));
  }

  public static class forBusiness {
    // BufferedReader와 StringTokenizer로 입력값을 받고,

    private static int reverseInt(String s) {
      char[] arr = s.toCharArray();
      char temp = arr[0];
      arr[0] = arr[arr.length - 1];
      arr[arr.length - 1] = temp;

      return Integer.parseInt(String.valueOf(arr));
    }

    // 선언한 메서드를 통해 int 값으로 변환 시켜,
    // 더 큰 숫자를 sout한다.

  }

  public static void main(String[] args) throws IOException {

    // 처음 풀이 코드

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    char[] first = st.nextToken().toCharArray();
    char[] second = st.nextToken().toCharArray();

    // 값 뒤집기
    char temp = first[0];
    first[0] = first[first.length - 1];
    first[first.length - 1] = temp;

    char temp2 = second[0];
    second[0] = second[second.length - 1];
    second[second.length - 1] = temp2;

    int firstValue = Integer.parseInt(String.valueOf(first));
    int secondValue = Integer.parseInt(String.valueOf(second));

    if (firstValue > secondValue) {
      System.out.print(firstValue);
    } else {
      System.out.print(secondValue);
    }
  }
}
