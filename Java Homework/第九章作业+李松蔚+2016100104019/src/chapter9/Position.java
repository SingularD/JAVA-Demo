package chapter9;

import java.util.Scanner;

public class Position {
    public static void main(String[] args){
        double[][] nums = new double[3][4];
        Scanner cin = new Scanner(System.in);
        for(int i = 0; i < 3; ++i){
            for(int j = 0; j < 4; ++j){
                nums[i][j] = cin.nextDouble();
            }
        }

        Location location = locateLargest(nums);
        System.out.println(location.maxValue + "--" + location.row + "," + location.column);
    }

    public static Location locateLargest(double[][] a){
        int x = 0,y = 0;
        double max = 0;
        for(int i = 0; i < a.length; ++i){
            for(int j = 0; j < a[i].length; ++j){
                if(a[i][j] > max){
                    max = a[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        Location temp = new Location();
        temp.row = x;
        temp.column = y;
        temp.maxValue = max;
        return temp;
    }
}

class Location{
    public int row,column;
    public double maxValue;
}

