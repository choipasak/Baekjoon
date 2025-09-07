package bronze;

import java.io.*;

public class No_11720 {
  public void firstSolve() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    String number = br.readLine();
    int sum = 0;

    for (int i = 0; i < T; i++) {
      // int v = number.charAt(i) - 48;
      sum += number.charAt(i) - '0';
    }
    System.out.print(sum);
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    br.readLine(); // 첫 줄 값 패스: 다음 값의 길이로 for문 횟수 지정 가능
    String number = br.readLine();

    int sum = 0;
    for (int i = 0; i < number.length(); i++) {
      sum += number.charAt(i) - '0';
    }
    System.out.print(sum);
  }
}
