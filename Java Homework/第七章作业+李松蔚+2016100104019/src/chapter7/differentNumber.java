package chapter7;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class differentNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Integer> num = new HashSet<>();
        for (int i = 0; i < 10 ;i++){
            num.add(input.nextInt());
        }
        num.toString();
        System.out.println(num.toString().replace(","," ").replace("[", "").replace("]", ""));
    }
}
