package Homework.Homework2;

class Circle{
       int radius;
       int  area;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*(radius*radius);
    }
    public static void main(String[]args){
Circle circle = new Circle();
         circle.setRadius(8);
    circle.getArea();
    System.out.print(circle.getArea());
    }

}