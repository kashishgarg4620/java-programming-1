import java.util.Scanner;
class Circle {
    // Declaring radius and color
    private  double radius;
    private String color;
    public Circle() {
        radius = 1.0;
        color = "red";
    }
    public Circle(double r) {
        radius = r;
        color = "red";
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
}
//Main
public class question4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle :");
        double r1= sc.nextDouble();
        Circle c2 = new Circle(r1);
        System.out.println("Radius of circle is "+ c2.getRadius() + "\nArea of circle is " + c2.getArea());
    }
}