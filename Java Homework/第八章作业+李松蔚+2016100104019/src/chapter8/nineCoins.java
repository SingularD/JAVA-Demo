package chapter8;

import java.util.Scanner;

public class nineCoins {
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 511:");
        int num = cin.nextInt();
        int[] bits = new int[9];
        java.util.Arrays.fill(bits, 0);
        int i = 0;
        while(num > 0){
            bits[i] = num%2;
            num /= 2;
            ++i;
        }
        System.out.println();

        for(int j = 8; j >= 0; --j){
            if(bits[j] == 1)
                System.out.print("T ");
            else
                System.out.print("H ");
            if(j%3 == 0)
                System.out.println();
        }
    }
}
