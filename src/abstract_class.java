
import javax.swing.*;
import java.math.*;
import java.util.*;

public class abstract_class {
public static void main(String[] args) {
GeometricObject cir=new Circle(5);
GeometricObject rec=new Rectangle(3,4);
cir.setColor("RED");
cir.setFilled(true);
System.out.println(cir.getArea()+" and color="+cir.getColor());
System.out.println("rect="+rec.getArea());

if(cir.isFilled())
{System.out.println("Filled");}
else
{System.out.println("Not Filled");}
}
}
