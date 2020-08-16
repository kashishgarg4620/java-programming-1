import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int no= sc.nextInt();
        ArrayList<Integer> list= new ArrayList<>(no);
        int k;
        for(int i=1;i<=no;i++) {
            try
            {
                k=sc.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("Can only enter Integer values");
                break;
            }
            list.add(k);
        }
        for (Integer integer : list) {
            //for 2/3rd
            System.out.println((0.67)*integer + " ");
        }
    }
}