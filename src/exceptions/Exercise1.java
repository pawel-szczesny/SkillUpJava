package exceptions;

public class Exercise1 {
	public static void main(String[] args) {
		Exercise1 exOne = new Exercise1();
		
		exOne.firstException();
		
		exOne.secondException();
		
	}
	
	public void firstException() {
		int wrongNumber = 3/0;
	}
	
	public void secondException() {
		Integer[] integerArray = new Integer[]{1,2,3};
		int number = integerArray[-1];
	}
}
