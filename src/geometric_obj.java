 abstract class GeometricObject{
 private String color="White";
 private boolean filled;
 public String getColor(){ return color;}
 public void setColor(String color){this.color=color;}
 public boolean isFilled(){return filled;}
 public void setFilled(boolean filled){this.filled=filled;} 
 public abstract double getArea();
 
 }
 class Circle extends GeometricObject{
 private double radius;
 public Circle(){};
 public Circle(double radius){this.radius=radius;}
 public double getArea(){return Math.PI*radius*radius;} 
 }
 class Rectangle extends GeometricObject{
 private double width;
 private double length;
 public Rectangle(){};
 public Rectangle(double width, double length){this.width=width;this.length=length;}
 public double getArea(){return width*length;} 
 }
 
