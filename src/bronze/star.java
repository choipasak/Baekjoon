package bronze;

import java.util.Scanner;

public class star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String star = "*";
        for (int i=1; i <= a; i++){
            System.out.println(star.repeat(i));
        }
    }
}
