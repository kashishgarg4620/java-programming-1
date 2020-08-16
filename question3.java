import java.util.Scanner;
public class question3 {
    int empId;
    String empName;
    float empSalary;
    String empDesignation;
    String empLocation;
    public void getInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Employee id : ");
        empId = in.nextInt();
        System.out.print("Enter the Name of Employee : ");
        empName = in.next();
        System.out.print("Enter the Salary of Employee : ");
        empSalary = in.nextFloat();
        System.out.print("Enter the Designation of Employee : ");
        empDesignation = in.next();
        System.out.print("Enter the Location of job : ");
        empLocation = in.next();
    }
    public void setnames() {
        System.out.println("Employee name = " + empName);
    }
    public void setsalary() {
        if(empSalary>50000) {
            System.out.println("Employee salary = " + empSalary);
        }
    }
    public void setloc() {
        if(empLocation.charAt(1)=='M'|| empLocation.charAt(1)=='m') {
            System.out.println("Employee salary = " + empLocation);
        }
    }
    public void setdesig() {
        if(empDesignation.charAt(empDesignation.length()-1)=='E'|| empDesignation.charAt(empDesignation.length()-1)=='e') {
            System.out.println("Employee salary = " + empDesignation);
        }
    }
    public static void main(String[] args) {
        Employee[] e = new Employee[10];
        System.out.println("Please enter data for 10 employees");
        for(int i=0; i<10; i++) {

            e[i] = new Employee();
            e[i].getInput();
        }
        System.out.println("Printing the name of all the employees.");
        for(int i=0; i<10; i++) {
            e[i].setnames();
        }
        System.out.println("Printing all the salaries which are greater than 50,000/-");
        for(int i=0; i<10; i++) {
            e[i].setsalary();
        }
        System.out.println("Printing all the locations starting with the letter ‘M’");
        for(int i=0; i<10; i++) {

            e[i].setloc();
        }
        System.out.println("Printing all the designations ending with ‘E’");
        for(int i=0; i<10; i++) {

            e[i].setdesig();
        }
    }
}