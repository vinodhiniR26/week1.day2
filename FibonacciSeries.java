package week1.day1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int range = 8, firstnum = 0, secnum = 1;
		System.out.println(firstnum);
	    System.out.println(secnum); //I added this line need to check logic

	    for (int i = 0; i <= range; i++) {
	      
	      int nextnum = firstnum + secnum;
	      firstnum = secnum;
	      secnum = nextnum;
	      
	      System.out.println(nextnum);
	    }
	    
	  
	}

}
