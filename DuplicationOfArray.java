package week1.day1.assignments;

public class DuplicationOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr =	new int[] {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		for(int i=0;i<arr.length;i++) {
			for(int j = i+ 1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.err.println("Duplication of arrays is: " + arr[j]);
				}
			}
		}
	}
	}


