package roundSumProject;

public class roundSum {
	public static void main(String[] args){
		int a = 12; 	// change these for testing
		int b = 13; 		// or use the website (https://codingbat.com/prob/p186753)
		int c = 14;
		roundSum sdf = new roundSum();
		System.out.println(sdf.getRoundSum(a, b, c));
	}
	
	public int getRoundSum(int a, int b, int c) {
		// adds the values rounded by round10() together and returns the resulting sum
		return round10(a) + round10(b) + round10(c); 
	}
	
	public int round10(int num) {
		// rounds the num to the next multiple of ten, rounding up if the rightmost digit is  >= 5
		// and rounding down for < 5
		return num % 10 >= 5 ? num - (num % 10) + 10 : num - (num % 10); 
	}
}