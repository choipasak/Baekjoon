package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class No_2738 {
  public void Mine() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String NM = br.readLine();
    int N = Integer.parseInt(NM.split(" ")[0]);
    int M = Integer.parseInt(NM.split(" ")[1]);
    int[][] A = new int[N][M];
    int[][] B = new int[N][M];
    String[] arr = new String[N];

    for (int i = 0; i < 2 * N; i++) {
      arr = br.readLine().split(" ");
      if (i < N) {
        A[i] = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
      } else {
        B[i - N] = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
      }
    }
    br.close();

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        sb.append(A[i][j] + B[i][j]).append(" ");
      }
      sb.append("\n");
    }
    System.out.println(sb.toString());

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[][] answer = new int[N][M];

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        answer[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        if (j > 0)
          sb.append(" ");
        sb.append(answer[i][j] + sc.nextInt());
      }
      sb.append("\n");
    }
    System.out.print(sb.toString());
  }
}