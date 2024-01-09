package introToJava;

public class BreakDemo {

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
	
		// if syntax 
		
	
	//find out if rollNumber array has a roll number 77563
		System.out.println("*********Starting the loop**********");
		for (int i = 0; i<5; i++) {
			System.out.println(rollNumber[i]);
			if(rollNumber[i] == 77563) {
			System.out.println(rollNumber[i]== 77563);
			break;
			}
			
			if(i == 3) {
				break;
			}
			
		}
		System.out.println("*********End of the loop**********");
		
//		
//		System.out.println("Start of the enhanced forloop"); 
//		(int e :rollNumber) 
//		{
//			System.out.println(e);
//		}
//		System.out.println("*********end of enhanced forloop**********");
//	}
		
	}
}
	
