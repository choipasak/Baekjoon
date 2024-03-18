package bronze;

import java.util.Scanner;

public class AlreadyExistedID {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] names = {"joonas", "baekjoon"};
        String name = sc.nextLine();
        for(int i=0; i<name.length(); i++){
            if(name.equals(names[i])){
                System.out.println(name + "??!");
            }
        }
        sc.close();
    }
}
