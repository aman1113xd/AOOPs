//Program to demonstrate some of the built in exception handlers in java

//main class
public class Program {
	
	//main method
	public static void main(String args[]) {
		
		//Arithmetic Exception
		try {
			int a = 10, b=0;//Dividing by zero raises an exception
			int c = a/b;
			System.out.println("The result is: " + c);
		}catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}
		
		//Null pointer Exception
		try {
			String str = null;//String is initialized to null
			System.out.println("The required string is: " + str);
		}catch(NullPointerException e) {
			System.out.println("The String does not exist");
		}
		
		//Array index out of bounds Exception
		try {
			int arr[] = new int[5];
			arr[6] = 1;//insertion of an element out of the scope of the array
		}catch(ArrayIndexOutOfBoundsException  e) {
			System.out.println("Array index is out of the limit of the declared array");
		}
	}//End of main method
}//End of main class