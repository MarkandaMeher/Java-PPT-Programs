package ExceptionHandling;
import java.io.*;
public class CheckedExceptionExamples {

}

//Doesn't Compile, throws exception if we not handle(specify)

/*
class checked{
	public static void main(String[] args) {
		FileReader file = new FileReader("C:\\Users\\piyus\\a.txt");
		BufferedReader fileInput = new BufferedReader(file);
		for(int counter = 0;counter<3;counter++)
			System.out.println(fileInput.readLine());
		fileInput.close();
	}
}
*/

/*
class checkedCorrect{
	public static void main(String[] args) throws IOException{
		FileReader file = new FileReader("C:\\Users\\piyus\\a.txt");
		BufferedReader fileInput = new BufferedReader(file);
		for(int counter =0;counter<3;counter++)
			System.out.println(fileInput.readLine());
		fileInput.close();
	}
}

*/