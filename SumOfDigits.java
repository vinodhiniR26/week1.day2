package week1.day1.assignments;

import java.util.*;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number, digits = 0,sum =0;
			Scanner sc = new Scanner(System.in);
			number = sc.nextInt();
			System.out.println("Enter the number:" + number);
			while(number > 0) {
				digits = number % 10;
				sum = sum + digits;
				number = number /10;
			}
			System.out.println("Enter sum is " + sum);
				
			}
	}

