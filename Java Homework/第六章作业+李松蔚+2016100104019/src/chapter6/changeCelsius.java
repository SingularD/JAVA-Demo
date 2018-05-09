package chapter6;

import java.util.Scanner;

public class changeCelsius {
    public static double celsiusToFahrenheit(double celsius){
        double f;
        f = (9.0/5) * celsius +32;
        return f;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double c;
        c = (5.0/9) * (fahrenheit - 32);
        return c;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入要转换的温度并在空格后输入C或F表示当前温度类型：");
        double num = input.nextDouble();
        String kind = input.next();
        System.out.println(num+"...."+kind);
        if (kind.equals("C")){
            System.out.println("输入温度华氏度为：" + celsiusToFahrenheit(num));
        }else System.out.println("输入温度的摄氏度为： " + fahrenheitToCelsius(num));
    }
}
