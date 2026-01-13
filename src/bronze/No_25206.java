package bronze;

import java.util.Scanner;

public class No_25206 {
  public void mine() {
    Scanner sc = new Scanner(System.in);
    double sum = 0.0;
    double total = 0.0;
    while (sc.hasNext()) {
      String subject = sc.next();
      double score = Double.parseDouble(sc.next());
      String grade = sc.next();
      if (grade.equals("P")) {
        continue;
      } else if (grade.equals("F")) {
        continue;
      } else if (grade.equals("A+")) {
        sum += 4.5 * score;
      } else if (grade.equals("A0")) {
        sum += 4.0 * score;
      } else if (grade.equals("B+")) {
        sum += 3.5 * score;
      } else if (grade.equals("B0")) {
        sum += 3.0 * score;
      } else if (grade.equals("C+")) {
        sum += 2.5 * score;
      } else if (grade.equals("C0")) {
        sum += 2.0 * score;
      } else if (grade.equals("D+")) {
        sum += 1.5 * score;
      } else if (grade.equals("D0")) {
        sum += 1.0 * score;
      }
      total += score;
    }
    sc.close();
    System.out.printf("%.6f", sum / total);
  }

  public static void main(String[] args) {

    /*
     * 1. 의미가 다른 조건은 단계를 나눠서 처리한다 -> 조건1, 조건2 ...
     * 2. 비교 대상이 하나이거나, 조건이 ==나 .equals라면 (=값이 열거 및 고정 가능한 집합이라면) switch문이 더 적합하다.
     */

    Scanner sc = new Scanner(System.in);

    double sum = 0.0;
    double total = 0.0;

    for (int i = 0; i < 20; i++) {
      String subject = sc.next();
      double score = sc.nextDouble();
      String grade = sc.next();

      if (grade.equals("P")) {
        continue;
      }

      double gradePoint;
      switch (grade) {
        case "A+":
          gradePoint = 4.5;
          break;
        case "A0":
          gradePoint = 4.0;
          break;
        case "B+":
          gradePoint = 3.5;
          break;
        case "B0":
          gradePoint = 3.0;
          break;
        case "C+":
          gradePoint = 2.5;
          break;
        case "C0":
          gradePoint = 2.0;
          break;
        case "D+":
          gradePoint = 1.5;
          break;
        case "D0":
          gradePoint = 1.0;
          break;
        case "F":
          gradePoint = 0.0;
          break;
        default:
          continue;
      }

      sum += score * gradePoint;
      total += score;
    }
    sc.close();
    System.out.printf("%.6f", sum / total);
  }
}