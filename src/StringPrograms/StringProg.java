package StringPrograms;

import java.util.Arrays;

public class StringProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Reverse string
		/*
		String s ="Welcome";
		String r = "";
		for(int i=s.length()-1;i>=0; i--)
		{
			r+=s.charAt(i);
		}
		System.out.println("Reverse String is: "+r);
		*/
		
		// By converting String to char array
		/*String s ="Welcome";
		String r = "";
		char c[] = s.toCharArray();
		
		for(int i=c.length-1;i>=0;i--) 
		{
			r+=c[i];
		}
		
		System.out.println(r);	
		*/
		
		// Using StringBuffer class
		/*
		StringBuffer s = new StringBuffer("Welcome");
		System.out.println(s.reverse());	
		*/
		
		// Using StringBuilder
		/*StringBuilder s = new StringBuilder("welcome");
		System.out.println(s.reverse());	
		*/
		
		//mutable and immutable - 
		// Strings are immutable in nature but with the help of 
		//StringBuilder and StringBuffer we can change it and store it in another variable
		
		//immutable  can not change
		/*		String s = new String("Welcome");
				System.out.println(s);	//Welcome
				s.concat(" to Java");	
				System.out.println(s);	//Welcome
				
				String concatstring = s.concat(" to java");
				System.out.println(concatstring);	//Welcome to java
		*/
		
		//mutable - can change
		/*
		int a[] = {10,50,90,30,20};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		*/
		
		//StringBuffer - mutable 
		/*StringBuffer s = new StringBuffer("Welcome");
		s.append(" to Java");
		System.out.println(s);
		*/
		
		//StringBuilder - mutable
		/*StringBuilder s = new StringBuilder("Welcome");
		s.append(" to Java");
		System.out.println(s);
		*/
		
		String s1 = "MADAM";
		String s2 ="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2+=s1.charAt(i);		
		}
		System.out.println(s1);
		System.out.println(s2);

		if(s1.equals(s2))
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		
	}

}
