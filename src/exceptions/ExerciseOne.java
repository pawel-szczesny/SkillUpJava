package exceptions;

public class ExerciseOne {
	public static void main(String[] args) {
		ExerciseOne exOne = new ExerciseOne();
		
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
