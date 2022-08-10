package _00_intro_to_array_lists;

import java.lang.reflect.AnnotatedTypeVariable;
import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
ArrayList<String> array = new ArrayList<String>();
		//2. Add five Strings to your list
		array.add("hegosugraoreuna");
		array.add("greghurhg");
		array.add("rtruytut");
		array.add("nvxmznxcv");
		array.add("13984eoewd");
		
		//3. Print all the Strings using a standard for-loop
		for(int i=0;i<array.size();i++) {
			String s = array.get(i);
			System.out.println(s);
		}
		System.out.print("\n");
		//4. Print all the Strings using a for-each loop
		for(String var:array) {
			
			System.out.println(var);
		}
		System.out.print("\n");
		//5. Print only the even numbered elements in the list.
		for(int i=0;i<array.size();i++) {
			if(i % 2 == 0) {
				System.out.println(array.get(i));
			}
		 }
		System.out.print("\n");
		//6. Print all the Strings in reverse order.
		StringBuilder input1 = new StringBuilder();
		input1.append(array);
		input1.reverse();
		System.out.print(input1);
		System.out.print("\n");
		//7. Print only the Strings that have the letter 'e' in them.
		
		
for(String var:array) {
			
	System.out.println(var.contains("e") ? true: false);
	//have absolutely no idea how to do this bruh i spent 30 mins deleting/undoing/searchinig/
	//all that man im skipping this
	
	
		}
		
		
	}
}
