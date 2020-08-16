import java.util.Scanner;
interface calc
{
    int o(int a,int b);
}
public class question1
{
    public static void main(String[] args)
    {
        //Lambda Expressions
        calc addition= (int a, int b)-> a+b;
        calc difference=(int a, int b)-> a-b;
        calc product=(int a, int b)-> a*b;
        calc safeDivision=(int a, int b)-> a/b;
        System.out.println("Enter the value of and b to perform operations");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("1.Addition\n2.Difference\n3.Product\n4.SafeDivision");
        System.out.println("Enter the option");
        int n=sc.nextInt();
        switch (n) {
            case 1:{
                System.out.println("Addition of a and b = " + addition.o(a, b));
                break;}
            case 2:{
                System.out.println("Difference of a and b = " + difference.o(a, b));
                break;}
            case 3:{
                System.out.println("Product of a and b = " + product.o(a, b));
                break;}
            case 4:{
                System.out.println("Safe Division of a and b = " + safeDivision.o(a, b));
                break;
           }
        }
    }
}
