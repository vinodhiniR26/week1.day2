package week1.day1.assignments;

import java.util.*;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calc = new Calculator();
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		System.out.println("Addition of three numbers is " + calc.add(n1, n2, n3));// 1+2+3 = 6
			
		System.out.println("Substraction of two numbers is " + calc.sub(n1,n2));
		
		System.out.println("Multiplication of two numbers is " +calc.mul(n1,n2));
		
		System.out.println("Division of two numbers is " +calc.divide(n1,n2));

	}

}
