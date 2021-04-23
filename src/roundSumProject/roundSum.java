package roundSumProject;

public class roundSum {
	public static void main(){
		int a = 13; 	// change these for testing
		int b = 3; 		// or use the website (https://codingbat.com/prob/p186753)
		int c = 59;
		roundSum sdf = new roundSum();
		System.out.println(sdf.getRoundSum(a, b, c));
	}
	
	public int getRoundSum(int a, int b, int c) {
		// adds the values rounded by round10() together and returns the resulting sum
		return 0;  
	}
	
	public int round10(int num) {
		// rounds the num to the next multiple of ten, rounding up if the rightmost digit is  >= 5
		// and rounding down for < 5
		return 0;
	}
}
