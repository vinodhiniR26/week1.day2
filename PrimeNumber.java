package week1.day1.assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 13;
		
		boolean tag = false;
		
		for(int i=2; i <= num /2 ;i++){	
			if(num % i == 0) {
				tag = true;
				break;
			}
		}
		if(!tag) {
			System.out.println(num + " is a prime number");
		}else {
			System.out.println(num + "is not a prime number");
		}
	}

	
}
