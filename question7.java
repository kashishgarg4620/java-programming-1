import java.util.Scanner;
public class question7 {
    public static void main(String[] args) {
        double area = areaoftriangle();
        System.out.format("The Area of triangle = %.2f\n", area);
    }
    public static double areaoftriangle()
    {
        double s, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Please Enter Three sides of triangle: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        //semi-perimeter
        s = (a + b + c) / 2;
        System.out.format("\n The Semi perimeter of triangle = %.2f\n", s);
        // area
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }
}