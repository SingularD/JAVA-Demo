package chapter9;

public class getAreas {
    public static void main(String[] args){
        RegularPolygon g1 = new RegularPolygon();
        System.out.println("g1 perimeter:" + g1.getPerimeter() + "    " + "g1 area:" + g1.getArea());
        RegularPolygon g2 = new RegularPolygon(6,4);
        System.out.println("g2 perimeter:" + g2.getPerimeter() + "    " + "g2 area:" + g2.getArea());
        RegularPolygon g3 = new RegularPolygon(10,4,5.6,7.8);
        System.out.println("g3 perimeter:" + g3.getPerimeter() + "    " + "g3 area:" + g3.getArea());
    }
}

class RegularPolygon{
    private int n;
    private double side;
    private double x;
    private double y;

    public RegularPolygon(){
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }

    public RegularPolygon(int num, double len){
        n = num;
        side = len;
        x = 0;
        y = 0;
    }

    public RegularPolygon(int num, double len, double a, double b){
        n = num;
        side = len;
        x = a;
        y = b;
    }

    public int getN(){
        return n;
    }

    public void setN(int num){
        n = num;
    }

    public double getSide(){
        return side;
    }

    public void setSide(double len){
        side = len;
    }

    public double getX(){
        return x;
    }

    public void setX(double X){
        x = X;
    }

    public double getY(){
        return y;
    }

    public void setY(double Y){
        y = Y;
    }

    public double getPerimeter(){
        return n*side;
    }

    public double getArea(){
        return (n*side*side)/(4*Math.tan(Math.PI/n));
    }
}
