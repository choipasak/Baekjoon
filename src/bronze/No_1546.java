package bronze;

import java.io.*;
import java.util.*;

public class No_1546 {

  public void firstSolve() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int subjects = Integer.parseInt(st.nextToken());
    double[] scores = new double[subjects];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < subjects; i++) {
      scores[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(scores);
    double bestScore = scores[subjects - 1];
    for (int i = 0; i < subjects; i++) {
      scores[i] = scores[i] / bestScore * 100;
    }

    double sum = 0;
    for (double i : scores) {
      sum += i;
    }

    System.out.printf("%.6f", sum / subjects);

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int subjects = sc.nextInt();
    double sum = sc.nextInt();
    double max = 0;

    for (int i = 0; i < subjects; i++) {
      int score = sc.nextInt();
      sum += score;
      if (max < score) {
        max = score;
      }
    }

    System.out.printf("%.2f", sum / max * 100 / 3);
  }

}
