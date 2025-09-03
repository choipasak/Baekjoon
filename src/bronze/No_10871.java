package bronze;

import java.util.*;

public class No_10871 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int num = sc.nextInt();

    for (int i = 0; i < size; i++) {
      int v = sc.nextInt();
      if (v < num) {
        System.out.print(v + " ");
      }
    }
  }

  /*
   * IO 데이터의 값이 크거나 많은 경우
   * ㄴ> BufferReader/StringTokenizer/StringBuilder를 사용하여 IO Bound를 줄이기!
   */

}
