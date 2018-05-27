package regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("a*b?cde");
		
		Matcher matcher = pattern.matcher("jakis ciag znakow");
		System.out.println(matcher.matches()); //zwraca true lub false
		
		Pattern.matches("regex", "ciąg do sprawdzenia"); //zwraca true lub false
		
		
		Pattern pattern2 = Pattern.compile("regex"); 
		Matcher matcher2 = pattern2.matcher("ciąg do sprawdzenia"); 
		System.out.println(matcher2.matches()); //zwraca true lub false
		
		Pattern.matches("regex", "ciąg do sprawdzenia"); //zwraca true lub false
	}

}
