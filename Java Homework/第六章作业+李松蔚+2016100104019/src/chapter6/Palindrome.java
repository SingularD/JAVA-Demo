package chapter6;

import java.util.Scanner;

public class Palindrome {
    public static String str = "";
    public static int reverse(int number){
        while (number != 0){
            str += number%10;
            number = number/10;
        }
        return Integer.parseInt(str);
    }
    public static boolean isPlindrome(int number){
        if (number == reverse(number)) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个数字");
        int a = input.nextInt();
        if (isPlindrome(a)) {
            System.out.println("该数是回文数");
        }else System.out.println("不是回文数");
    }
}
