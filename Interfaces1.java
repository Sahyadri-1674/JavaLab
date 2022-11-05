import java.util.Scanner;

interface Shapes{
    void calcArea();
    void calcPerimeter();

    private void greet(){
        System.out.println("Hello everybody,Good Morning!");
    }
    default void welcome(){
        greet();
        System.out.println("Thank You For Implementing me");
    }

}

class Rectangle1 implements Shapes{
    private double length ,breadth;
    Rectangle1(double l,double b){
        length=l; breadth=b;
    }
    public void calcArea(){
        System.out.println("Area of the rectangle is "+(length*breadth));
    }
    public void calcPerimeter(){
        System.out.println("Perimeter of the rectangle is "+(2*(length+breadth)));
    }
}
public class Interfaces1 {
    public static void main(String[] args) {
        double len,bre;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth of the Rectangle");
        len = sc.nextDouble();
        bre = sc.nextDouble();
        Rectangle1 ob = new Rectangle1(len,bre);
        ob.welcome();
        ob.calcArea();
        ob.calcPerimeter();

    }
}
