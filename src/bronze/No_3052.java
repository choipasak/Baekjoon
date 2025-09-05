package bronze;

import java.io.*;
import java.util.*;

public class No_3052 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Set<Integer> set = new HashSet<>();

    for (int i = 0; i < 10; i++) {
      int A = Integer.parseInt(br.readLine());
      int res = A % 42;
      set.add(res);

    }

    System.out.println(set.size());

  }
}
