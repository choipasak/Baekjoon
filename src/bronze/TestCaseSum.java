package bronze;

import java.util.Scanner;

public class TestCaseSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        int i = 1;
        while (i <= t) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sb.append(a + b + "\n");
            i++;
        }
        System.out.println(sb);

    }
}
