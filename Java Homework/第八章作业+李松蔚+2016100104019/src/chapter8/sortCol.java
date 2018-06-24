package chapter8;

import java.util.Scanner;

public class sortCol {
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row:");
        double[][] matrix = new double[3][3];
        for(int i = 0; i < 3; ++i){
            for(int j = 0; j < 3; ++j){
                matrix[i][j] = cin.nextDouble();
            }
        }

        matrix = sortColumns(matrix);

        for(int i = 0; i < 3; ++i){
            for(int j = 0; j < 3; ++j){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] sortColumns(double[][] m){
        for(int i = 0; i < 3; ++i){
            for(int j = 0; j < 3; ++j){
                for(int v = j+1; v < 3; ++v){
                    if(m[j][i] > m[v][i]){
                        double temp = m[j][i];
                        m[j][i] = m[v][i];
                        m[v][i] = temp;
                    }
                }
            }
        }
        return m;
    }
}
