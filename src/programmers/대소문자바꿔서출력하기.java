package programmers;

import java.util.Scanner;

public class 대소문자바꿔서출력하기 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    String a = sc.next();
    for (int i = 0; i < a.length(); i++) {
      char now = a.charAt(i);
      if (Character.isUpperCase(now)) {
        sb.append(Character.toLowerCase(now));
      } else {
        sb.append(Character.toUpperCase(now));
      }
    }
    System.out.println(sb.toString());
  }
}
