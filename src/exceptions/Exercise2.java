package exceptions;

import java.util.Random;

public class Exercise2 {
	public static void main(String[] args) {
		Exercise2 exTwo = new Exercise2();
		
		exTwo.randomException();		
	}
	
	public void randomException() {
		Random rand = new Random(); 
		int n = rand.nextInt(2);
		
		if(n == 0) {
			int wrongNumber = 3/0;
		} else if (n == 1) {
			Integer[] integerArray = new Integer[]{1,2,3};
			int number = integerArray[-1];
		}
	}
}
