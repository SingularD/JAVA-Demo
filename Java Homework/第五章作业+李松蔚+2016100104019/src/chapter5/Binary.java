package chapter5;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个需要转化为二进制的十进制数：");
        int a = input.nextInt();
        String num = "";
        while (a != 0){
            num = a%2 + num;
            a = a/2;
        }
        System.out.println("二进制为：" + num);
    }
}
