package ExceptionHandling;

public class Examples {

}
class Main2{
	public void first(){int data=50/0;  }
	public void second(){first();}
	public void third(){try{second();}
				catch(Exception e){ System.out.println("Exception occurred");}
		}
	public static void main(String [] args){
	Main2 ob = new Main2();
	ob.third();
	System.out.println("Thank You");
		}
}

//Java program to demonstrate ArithmeticException
class Main3
{
	public static void main(String args[])
	{
		try {
			int a = 30, b = 0;
			int c = a/b; // cannot divide by zero
			System.out.println ("Result = " + c);
		}
		catch(ArithmeticException e) {
			System.out.println ("Can't divide a number by 0");
		}

		System.out.println("Code will execute after the exception handled");
	}
}


//Java program to demonstrate NullPointerException
class NullPointer_Demo
{
	public static void main(String args[])
	{
		try {
			
			String a = null; //null value
			System.out.println(a.charAt(0));
		} catch(NullPointerException e) {
			System.out.println("NullPointerException..");
		}
	}
}


class Main4 {
public static void main(String args[]) {
int a[]=new int[5];
try {
    System.out.println(a[7]);
} 
catch(ArrayIndexOutOfBoundsException e)
{
    System.out.println(e);
}
System.out.println("After try catch...");
}
}


class Main5 {
public static void main(String args[]) {
String x="Testing";
try {
    System.out.println(x.charAt(7));
} 
catch(StringIndexOutOfBoundsException e)
{
    System.out.println(e);
}
System.out.println("After try catch...");
}
}

class Main6

{
	public static void main(String[] args) {
		try 
		{
		    int a=12,b=0;
		    System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
		    System.out.println(e);
		    e.printStackTrace();
		    System.out.println(e.getMessage());
		}
	}
}

class Main7
{
	public static void main(String[] args) {
		try 
		{
		    throw new ArithmeticException("Wrong denominator");
		}
		catch(ArithmeticException e)
		{
		    System.out.println(e);
		    e.printStackTrace();
		    System.out.println(e.getMessage());
		}
	}
}
