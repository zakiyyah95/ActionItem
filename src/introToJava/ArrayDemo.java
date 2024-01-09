package introToJava;

public class ArrayDemo {

	public static void main(String[] args) {

		int roll1 = 23001;
		int roll2 = 23002;
		int roll3 = 23003;
		int roll4 = 23004;
		int roll5 = 23005;
		
		//array declaration 
		int [] rollNumber = new int[5];
		//assigning values to the array 
		rollNumber[0] = 23001;
		rollNumber[1] = 23002;
		rollNumber[2] = 23003;
		rollNumber[3] = 23004;
		rollNumber[4] = 23005;
		
		System.out.println("This is: " + roll4);
		System.out.println(rollNumber[3]);
		
		// using random method //
		// the way to declare and assigning a value to an array at one go 
		double [] numberGame = {Math.random(), Math.random(), Math.random(), Math.random()};
		System.out.println(numberGame[3]);
		System.out.println(numberGame[0]);
		System.out.println(numberGame[1]);
		System.out.println(numberGame[2]);
		
	// Using Random method / narrowing type casting //
		
		int [] numberGame2 = 
				{(int)(Math.random()*100), 
				(int)(Math.random()*100),
				(int)(Math.random()*100), 
				(int)(Math.random()*100)};
		
		System.out.println(numberGame2[0]);
		System.out.println(numberGame2[1]);
		System.out.println(numberGame2[2]);
		System.out.println(numberGame2[3]);
		
		
		
		
	}

}
