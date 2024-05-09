package Training;
import java.util.Scanner;

public class Complex {
	double real;
	double imaginary;
	
public Complex(double real,double imaginary) {
	this.real=real;
	this.imaginary=imaginary;
}

public Complex add(Complex other) {
	double realsum=(this.real + other.real);
	double imaginarysum=(this.imaginary + other.imaginary);
	return new Complex(realsum,imaginarysum);
}

public Complex subract(Complex other) {
	double realsub =(this.real - other.real);
	double imaginarysub = (this.imaginary - other.imaginary);
			return new Complex(realsub,imaginarysub);
}

public Complex multiply(Complex other) {
	double realmul = ((this.real*other.real)-(this.imaginary*other.imaginary));
	double imaginarymul = ((this.real*other.imaginary)-(this.imaginary*other.real));
	return new Complex(realmul,imaginarymul);
}
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the real and imaginary parts of first complex number");
	double real1 = sc.nextDouble();
	double imaginary1 = sc.nextDouble();
	Complex aobj1=new Complex(real1,imaginary1);
	
	System.out.println("enter the real and imaginary parts of second complex number");
	double real2 = sc.nextDouble();
	double imaginary2=sc.nextDouble();
	Complex aobj2=new Complex(real2,imaginary2);
	
	Complex sum = aobj1.add(aobj2);
	Complex difference = aobj1.subract(aobj2);
	Complex multiply = aobj1.multiply(aobj2);
	
	System.out.println("sum=" + sum.real + sum.imaginary + "i" ); 
	System.out.println("difference=" + difference.real + difference.imaginary + "i" );
	System.out.println("multiply=" + multiply.real + multiply.imaginary + "i" );
}
}
