import java.util.Scanner;
//Creating class complex
class Complex{
    int real;
    int image;
    public Complex(int r, int i){
        real = r;
        image = i;
    }
    //Addition
    public static Complex add(Complex a, Complex b){
        return new Complex((a.real+b.real),(a.image+b.image));
    }
    //Difference
    public static Complex diff(Complex a, Complex b){
        return new Complex((a.real-b.real),(a.image-b.image));
    }
    //Product
    public static Complex product(Complex a, Complex b){
        return new Complex((a.real*b.real),(a.image*b.image));
    }
    //Printing
    public void printComplex(){
        if(real == 0 && image!=0){
            System.out.println(image+"i");
        }
        else if(image == 0 && real!=0){
            System.out.println(real);
        }
        else{
            System.out.println(real+"+"+image+"i");
        }
    }

}
//Main
class question5{
    public static void main(String[] args) {
        //Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first real number :");
        int r1 = sc.nextInt();
        System.out.println("Enter second real number :");
        int r2 = sc.nextInt();
        System.out.println("Enter first imaginary number :");
        int i1 = sc.nextInt();
        System.out.println("Enter second imaginary number :");
        int i2 = sc.nextInt();
        Complex c = new Complex(r1, i1);
        Complex d = new Complex(r2, i2);
        Complex e = Complex.add(c, d);
        Complex f = Complex.diff(c, d);
        Complex g = Complex.product(c, d);
        e.printComplex();
        f.printComplex();
        g.printComplex();
    }
}