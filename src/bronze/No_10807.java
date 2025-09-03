package bronze;

import java.util.*;

public class No_10807 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int size = sc.nextInt();
    List<Integer> arr = new ArrayList<>();

    for (int i = 0; i < size; i++) {
      arr.add(sc.nextInt());
    }

    int num = sc.nextInt();

    System.out.println(Collections.frequency(arr, num));

  }
}
