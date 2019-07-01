interface Shape{
 public double PI=3.14;
 public double area();
}
interface Color{
public String getColor();
}
class Circle implements Shape,Color{
private int radius;
private String color;
Circle(int radius,String color){
this.radius=radius;
this.color=color;
}
public double area(){
return PI*radius*radius;
}
public String getColor(){
return color;
}
}

class Triangle implements Shape,Color{
private int base,height;
private String color;
Triangle(int base,int height,String color){
this.base=base;
this.height=height;
this.color=color;
}
public double area(){
return 0.5*base*height;
}

public String getColor(){
return color;
}
}

public class SampleApplication{
public static void main(String args[]){
Triangle s1=new Triangle (34,89,"Red");
System.out.println(s1.area());
System.out.println(s1.getColor());
}
}