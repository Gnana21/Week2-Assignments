package assignments.selenium.week2.day2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "We learn java basics as part of java sessions in java week1";

		System.out.println("Original String: " + test);
		
		String[] str = test.split(" ");
		
		LinkedHashSet<String> newString = new LinkedHashSet<String>(Arrays.asList(str));
		
		System.out.println(newString);
		
			String newString1 =  newString.toString().replaceAll("[\\[\\],]", "");
				
		System.out.println("String after removing duplicate words: ");
		System.out.println(newString1);
		

	}

}
