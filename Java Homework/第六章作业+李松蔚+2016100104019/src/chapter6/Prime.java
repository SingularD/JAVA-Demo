package chapter6;

import java.util.Scanner;

public class Prime {
    public static boolean isPrime(double num){
        for (int i = 2;i < Math.sqrt(num);i++){
            if (num%i == 0){
                return false;
            }
        }
        return true;
    }
    public  static boolean isMPrime(double num){
        double m = Math.pow(2,num)-1;
        if (isPrime(num)){
            return isPrime(m);
        }else return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (isPrime(num)){
            System.out.println(isMPrime(num));
        }else System.out.println("Not a MPrime number");
    }
}
