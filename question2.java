import java.util.Scanner;
//Parent
class Rectangle
{
    public int breadth,length;
    public void display(int breadth,int length)
    {
        System.out.println("Breadth of rectangle : "+breadth+"\tLength of rectangle : "+length);
    }
}
//Child
class Area extends Rectangle
{
    public void read_input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter breadth and length: \n");
        breadth = sc.nextInt();
        length= sc.nextInt();
    }
    public void display()
    {
        System.out.println("Area of rectangle : "+breadth*length);
    }
}
//Main
public class question2 {
   public static void main(String[] args) {
        Area area=new Area();
        area.read_input();
        area.display(area.breadth, area.length);
        area.display();
    }
}