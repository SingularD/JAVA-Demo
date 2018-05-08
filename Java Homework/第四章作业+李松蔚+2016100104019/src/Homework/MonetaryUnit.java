package Homework;

import java.util.Scanner;

public class MonetaryUnit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next();
        int point = a.indexOf('.');
        String front = a.substring(0,point);
        String end = a.substring(point+1);
        System.out.println("dollars:" + front);
        System.out.println("pennies:" + end);
    }
}
