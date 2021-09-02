package assignments.selenium.week2.day2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Method 1
		 * Pseudo Code
		 
		 * Declare a String text with the following value
			String text = "Tes12Le79af65";
		   Declare a int variable sum
			int sum = 0;
		 * a) using replaceAll(), replace all the non-digits into ""
		 * b) Now, convert the String into array
		 * c) Iterate over the array and get each character
		 * d) Using Character.getNumericValue(), Change the char into int
		 * e) Add the values to sum & print
		 * 
		 */
		
		String text = "Tes12Le79af65";
		int sum = 0;
		String text1 = text.replaceAll("[^0-9]", "");
		
		System.out.println(text1);
		
		char[] text2 = text1.toCharArray();
		
		for(int i = 0; i<text2.length; i++) {
			
			int num = Character.getNumericValue(text2[i]);
			
			sum = sum + num;
			
		}	
		System.out.println(sum);
		
	}
	
	}

