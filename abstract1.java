import java.util.Scanner;

abstract class Shape{
    public Shape()
    {
        System.out.println("Constructor of Class Shape");
    }
    abstract protected void volume();
    abstract public void totalSurfaceArea();
}

class Cube extends Shape {
    private double side;
    Cube(double s){
        side=s;
    }
    public void volume(){
        System.out.println("Volume is "+(side*side*side));
    }
    public void totalSurfaceArea(){
        System.out.println("Total Surface area is "+(6*side*side));
    }
}

class Cuboid extends Shape {
    private double length,breadth,height,sa;
    Cuboid(double l,double b,double h){
        length = l; breadth = b; height = h;
    }
    public void volume(){
        System.out.println("Volume is "+(length*breadth*height));
    }
    public void totalSurfaceArea() {
        sa=2*((length*breadth)+(breadth*height)+(length*height));
        System.out.println("Total Surface Area is "+sa);
    }
}
public class abstract1 {
    public static void main(String[] args) {
        double l,b,h,s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the Cube");
        s = sc.nextDouble();
        Shape s1 = new Cube(s);
        s1.volume();
        s1.totalSurfaceArea();

        System.out.println("Enter the Length,Breadth and Height of the Cuboid");
        l=sc.nextDouble();
        b=sc.nextDouble();
        h=sc.nextDouble();
        Shape s2 = new Cuboid(l,b,h);
        s2.volume();
        s2.totalSurfaceArea();
    }
}
