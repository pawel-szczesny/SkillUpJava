package code_debugging_in_eclipse;

import java.util.ArrayList;
import java.util.Random;

public class Exercise2 {

	public static void main(String[] args) {
		Exercise2 exc2 = new Exercise2(); 
		
		String withoutZeros = exc2.removeZerosFromBegin("000011");
		System.out.println(withoutZeros);
	}
	
	public String removeZerosFromBegin(String polynomial){
		String result = "";
		if(polynomial.charAt(0) == '0'){
			for(int i=1;i<polynomial.length();i++){
				result += polynomial.charAt(i);
			}
			return removeZerosFromBegin(result);
		} else {
			return polynomial;
		}
	}
	
	
}
