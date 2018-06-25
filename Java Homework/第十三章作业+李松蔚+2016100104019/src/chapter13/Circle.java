
package chapter13;

public class Circle {
    private double radius = 1.0D;

    public Circle(){
        radius = 1.0D;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
}
