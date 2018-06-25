package chapter12;

import java.util.*;

public class Calculator {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[] integer = new int[100];
        for(int i = 0; i < 100; ++i)
            integer[i] = (int)(Math.random()*100);
        try{
            int index = cin.nextInt();
            System.out.println(integer[index]);
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Out of Bounds");
        }
    }

}
