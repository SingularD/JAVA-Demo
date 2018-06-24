package chapter8;

import java.util.Scanner;

public class Markov {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[][] mat = new double[3][3];
        System.out.println("Enter a 3-by-3 matrix row by row:");
        for (int i = 0;i < 3;i++){
            for (int j = 0;j < 3;j++){
                mat[i][j] = scan.nextDouble();
            }
        }
        if (check(mat)) System.out.println("It is a Markov matrix");
        else System.out.println("It is not a Markov matrix");
    }
    public static boolean check(double[][] mat) {

        for (int i = 0;i < 3;i++){
            for (int j = 0;j < 3;j++){
                if (mat[i][j] <= 0) return false;
            }
            double sum = mat[0][i] + mat[1][i] + mat[2][i];
            System.out.println(sum);
            if (sum != 1.00) return false;
        }
        return true;
    }
}
