package working_with_strings;

public class Example {

	public static void main(String[] args) {
		String slowo = "slowo";
		String drugiWyraz = new String("wyraz");
		
		String s = "1"; 
		s+="2"; 
		s+="3"; 
		System.out.println (s);//123
		
		System.out.println(1+3 );// 4 
		System.out.println("1"+"3" );//13 
		System.out.println(2+"3");//23
		System.out.println(1+2+"5"); //35
		
		String nazwaFirmy ="Apple"; 
		String dokladnyOpis = nazwaFirmy.concat(" iPhone "); 
		dokladnyOpis.concat("X"); 
		System.out.println(dokladnyOpis); // Apple iPhone
	
		StringBuilder sb = new StringBuilder().append("wiekKota").append(":").append(1).append('r'); 
		System.out.println(sb);//wiekKota:1r
		
		String przyklad ="Hello world!"; 
		System.out.println(przyklad.charAt(2));//l
		
		
		String miejsce = "przefantastycznie"; 
		System.out.println(miejsce.toUpperCase());//PRZEFANTASTYCZNIE 
		System.out.println(miejsce.toLowerCase());//przefantastycznie 
		
		String male ="abc"; 
		String duze = "ABC"; 
		System.out.println(male.equals(duze));//false 
		System.out.println(male.equalsIgnoreCase(duze));//true
		
		System.out.println(male.startsWith("a"));//true 
		System.out.println(male.startsWith("A"));//false
		System.out.println(male.endsWith("c"));//true 
		System.out.println(male.endsWith("C"));//false
		
		String hello = "Hello world!";
		
		System.out.println(hello.contains("!"));//true 
		System.out.println(hello.contains("Hello"));//true
		System.out.println(hello.contains("elo"));//false 
		System.out.println("kot".replace('o','i'));//kit 
		System.out.println("kot".replace("t","p"));//kop	
	}

}
