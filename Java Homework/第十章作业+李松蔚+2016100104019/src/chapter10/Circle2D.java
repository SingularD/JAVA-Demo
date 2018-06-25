package chapter10;

class Circle2D{
    private double x;
    private double y;
    private double radius;

    public Circle2D(){
        x = y = 0;
        radius = 1;
    }

    public Circle2D(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getPerimeter(){
        return Math.PI*2.0*radius;
    }

    public boolean contains(double x, double y){
        double dis = Math.sqrt((x-this.x)*(x-this.x) + (y-this.y)*(y-this.y));
        if(dis < radius) return true;
        return false;
    }

    public boolean contains(Circle2D circle){
        double tx = circle.getX();
        double ty = circle.getY();
        double tradius = circle.getRadius();
        double dis = Math.sqrt((tx-this.x)*(tx-this.x) + (ty-this.y)*(ty-this.y));
        if((this.radius-tradius) > dis) return true;
        return false;
    }

    public boolean overlaps(Circle2D circle){
        double tx = circle.getX();
        double ty = circle.getY();
        double tradius = circle.getRadius();
        double maxRadius,minRadius;
        double dis = Math.sqrt((tx-this.x)*(tx-this.x) + (ty-this.y)*(ty-this.y));
        if((this.radius+tradius) < dis) return false;
        if(tradius > this.radius){
            maxRadius = tradius;
            minRadius = this.radius;
        }else{
            maxRadius = this.radius;
            minRadius = tradius;
        }
        if((maxRadius-minRadius) > dis) return false;
        return true;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

}

