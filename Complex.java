package surajapplication;

import java.util.Scanner;
public class Complex {
	private double real;
	private double imaginary;
	private double realProduct;
	
	public Complex(double real, double imaginary) {
		this.real =real;
		this.imaginary = imaginary;
	}
	
	public Complex add(Complex other) {
		double realSum= this.real+other.real;
		double imaginarySum= this.imaginary+other.imaginary;
		return new Complex(realSum, imaginarySum);
	}
	public Complex subtract(Complex other) {
		double realDifference = this.real - other.real;
		double imaginaryDifference = this.imaginary - other.imaginary;
		double imaginaryProduct = 0;
		return new Complex(realProduct, imaginaryProduct);
	}
	public void display() {
		if(imaginary >=0) {
			System.out.println(real + "+" +imaginary +"i");
			
		}else {
			System.out.println(real+"-" + Math.abs(imaginary)+"i");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scanner = new Scanner(System.in);
       System.out.println("enter the real part of thr first complex number:");
       double real1 = scanner.nextDouble();
       System.out.println("enter the imaginary part of the first complex number:");
       double imaginary1 = scanner.nextDouble();
       
       System.out.println("enter the real part of the second complex number:");
       double real2 = scanner.nextDouble();
       System.out.println("enter the imaginary part of the second complex number:");
       double imaginary2 = scanner.nextDouble();
       
       Complex complex1 =new Complex(real1, imaginary1);
       Complex complex2 = new Complex(real2, imaginary2);
       
       
       Complex sum = complex1.add(complex2);
       Complex difference = complex1.subtract(complex2);
       Complex product = complex1.multiply(complex2);
       
       System.out.print("Sum: ");
       sum.display();
       System.out.print("Difference: ");
       difference.display();
       System.out.print("Product: ");
       product.display();
       
	}

	private Complex multiply(Complex complex2) {
		// TODO Auto-generated method stub
		return null;
	}

}
