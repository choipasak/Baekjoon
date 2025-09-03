package bronze;

import java.util.*;
import java.util.stream.Collectors;

public class No_2840 {

  public class firstSolve {
    // Scanner sc = new Scanner(System.in);

    // int A = sc.nextInt();
    // int B = sc.nextInt();
    // int C = sc.nextInt();

    // ArrayList<Integer> list = new ArrayList<>(Arrays.asList(A, B, C));
    // ArrayList<Integer> distinctList = list.stream()
    // .distinct()
    // .collect(Collectors.toCollection((ArrayList::new)));
    // ArrayList<Integer> result = new ArrayList<>(list)

    // if (distinctList.size()==1){
    // System.out.println(10000 + (list.get(0) * 1000));
    // }else if(distinctList.size()==2)
    // {
    // for (Integer n : distinctList) {
    // result.remove(n);
    // }
    // System.out.println(1000 + (result.get(0) * 100));
    // }else if(distinctList.size()==3)
    // {
    // System.out.println(Collections.max(list) * 100);
    // }

    // sc.close();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int price = 0;

    if (A == B && B == C) {
      price = 10000 + 1000 * A;
    } else if (A == B || A == C) {
      price = 1000 + 100 * A;
    } else if (B == C) {
      price = 1000 + 100 * B;
    } else if (A != B && B != C || A != C) {
      int[] arr = { A, B, C };
      int maxValue = Arrays.stream(arr).max().getAsInt();
      price = 100 * maxValue;
    }

    System.out.println(price);

    sc.close();

  }
}
