package chapter6;

import java.util.Scanner;

public class checkPassword {
    public static String check(String str){
        int n = 1,w = 1;
        if (str.length() > 8 && (str.length() == 0)){
            return "Invalid Password";
        }
        for (int i = 0;i < str.length();i++){
            if (Character.isDigit(str.charAt(i))){
                n++;
            }else if (Character.isLetter(str.charAt(i))){
                w++;
            }else {
                return "Invalid Password";
            }
        }
        if (n <= 2) return  "Invalid Password";
        return "Valid Password";
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        check(str);
        System.out.println(check(str));
    }
}
