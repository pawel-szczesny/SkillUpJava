package exceptions;

// Mała podpowiedz - kod czytamy jak ksiażke
// Kolejność wykonania pomaga nam w zrozumieniu co się dzieje i jak działa program

public class Example {
	public static void main(String[] args) {
		
		//Tworzenie obiektu example:
		Example example = new Example();
		
		//Użycie metody z obiektu example:
		example.catchedException();
		System.out.println("Program dalej się wykonuje");
		
		
		
	}
	
	public void catchedException() {
		try {
			int wrongNumber = 3/0;
		} catch(Exception e) {
			System.out.println("Zlapalem Cie");
			System.out.println("Co się stało: " + e.getMessage());
			System.out.println("Dokładniejsze dane: ");
			e.printStackTrace();
		} finally {
			System.out.println("Wykonam sie zawsze");
		}
	}
	
	public void notCatchedException() {
		
	}
	
	public void syntax() {
		
	}
	
}
