package WrapperClasses;

public class Examples {
	public static void main (String[] args) 
	{ 
		// creating an Integer Object 
		// with value 10. 
		Integer i = new Integer(10); 
		// unboxing the Object 
		int i1 = i; 
		System.out.println("Value of i: " + i); 
		System.out.println("Value of i1: " + i1); 
		//Autoboxing of char 
		Character ch1 = 'a'; 
		// Auto-unboxing of Character 
		char ch2 = ch1; 
		System.out.println("Value of ch1: " + ch1); 
		System.out.println("Value of ch2: " + ch2); 

	} 

}

//Java program to demonstrate typeValue() method
class Test
{
	public static void main(String[] args) 
	{
	// Creating a Double Class object with value "6.9685"
		Double d = new Double("6.9685");	
	// Converting this Double(Number) object to 
		// different primitive data types
		byte b = d.byteValue(); 
		short s = d.shortValue(); 
		int i = d.intValue(); 
		long l = d.longValue(); 
		float f = d.floatValue(); 
		double d1 = d.doubleValue(); 
System.out.println("value of d after converting it to byte : " +b);
System.out.println("value of d after converting it to short : " + s);
System.out.println("value of d after converting it to int : " + i);
	System.out.println("value of d after converting it to long : " + l);	
	System.out.println("value of d after converting it to float : " + f);
	System.out.println("value of d after converting it to double : " + d1);
	}
}


//Java program to demonstrate Integer.parseInt() method
 class Test2
{
	public static void main(String[] args)
	{
		// parsing different strings
		int z = Integer.parseInt("654",8); 
		int a = Integer.parseInt("-FF", 16);
	    long l = Long.parseLong("2158611234",10); 
		System.out.println(z);
		System.out.println(a);
		System.out.println(l);			
//run-time NumberFormatException will occur here
		// “Hello" is not a parsable string
		int x = Integer.parseInt("Hello",8); 
//run-time NumberFormatException will occur here
	// (for octal(8),allowed digits are [0-7])
		int y = Integer.parseInt("99",8); 
			
	}
}


//Java program to demonstrate Integer.parseInt() method
 class Test3
{
	public static void main(String[] args) 
	{
		// parsing different strings
		int z = Integer.parseInt("654"); 
	long l = Long.parseLong("2158611234");	
		System.out.println(z);
		System.out.println(l);
			
//run-time NumberFormatException will occur here
		// “Hello" is not a parsable string
		int x = Integer.parseInt("Hello"); 
			
//run-time NumberFormatException will occur here
	// (for decimal(10),allowed digits are [0-9])
		int a = Integer.parseInt("-FF");
			
	}
}

//Java program to illustrate toString() 

class Test4 { 
public static void main(String[] args) 
	{ 
Integer I = new Integer(10); 
	String s = I.toString(); 
	System.out.println(s); 
	} 
} 

//Java program to illustrate toString() 

class Test5 { 
	public static void main(String[] args) 
	{ 
		String s = Integer.toString(10); 
		System.out.println(s); 
		String s1 = Character.toString('a'); 
		System.out.println(s1); 
	} 
} 

//Java program to illustrate valueof() 

class Test6 { 
	public static void main(String[] args) 
	{ 
		Integer I = Integer.valueOf("10"); 
		System.out.println(I); 
		Double D = Double.valueOf("10.0"); 
		System.out.println(D); 
		Boolean B = Boolean.valueOf("true"); 
		System.out.println(B); 

		// Here we will get RuntimeException 
		Integer I1 = Integer.valueOf("ten"); 
	} 
} 

//Java program to illustrate valueof() 

class Test7 { 
	public static void main(String[] args) 
	{ 
		Integer I = Integer.valueOf(10); 
		Double D = Double.valueOf(10.5); 
		Character C = Character.valueOf('a'); 
		System.out.println(I); 
		System.out.println(D); 
		System.out.println(C); 
	} 
} 

//Java program to demonstrate compareTo() method
 class Test8
{
	public static void main(String[] args) 
	{
//creating an Integer Class object with value "10"
	Integer i = new Integer("10");

	// comparing value of i
		System.out.println(i.compareTo(7)); 
		System.out.println(i.compareTo(11)); 
		System.out.println(i.compareTo(10)); 
	}
}

//Java program to demonstrate equals() method
 class Test9
{
	public static void main(String[] args)
	{
//creating a Short Class object with value "15"
		Short s = new Short("15");
//creating a Short Class object with value "10"
		Short x = 10;
//creating an Integer Class object with value "15"
		Integer y = 15;
//creating another Short Class object with value "15"
		Short z = 15;
//comparing s with other objects
		System.out.println(s.equals(x));
		System.out.println(s.equals(y));
		System.out.println(s.equals(z));
	}
}





 
 