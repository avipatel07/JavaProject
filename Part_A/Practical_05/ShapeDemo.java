abstract class Shape { abstract double area(); }
class Circle extends Shape { double r; Circle(double r){this.r=r;} double area(){return Math.PI*r*r;} }
class Rectangle extends Shape { double w,h; Rectangle(double w,double h){this.w=w;this.h=h;} double area(){return w*h;} }
public class ShapeDemo { public static void main(String[] a){ Shape[] s={new Circle(3),new Rectangle(4,5)}; for(Shape x:s) System.out.printf("%.2f%n",x.area()); } }
