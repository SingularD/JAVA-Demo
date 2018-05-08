package chapter5;

import java.util.Scanner;

public class LoopTimes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();
        String hex= "";
        int a = 1;
        while (decimal != 0){
            int hexValue = decimal % 16;
            char hexDigit = (hexValue <= 9 && hexValue > 0)?
                    (char)(hexValue + '0') : (char)(hexValue - 10 + 'A');
            hex = hexDigit + hex;
            decimal = decimal/16;
            a++;
        }
        System.out.println("The hex number is :" + hex);
        System.out.println("The LoopTimes is :" + a);
    }
}
