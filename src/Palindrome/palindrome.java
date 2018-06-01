// Marcel-Pierre Douglas Samuels
package Palindrome;
import java.io.*;
import java.lang.*;
import javax.swing.*;


public class palindrome {
	

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		String val= "";
		welcome();
		Boolean change = false;
		
		// make sure user enters a string
		while (change== false) {	
		val = JOptionPane.showInputDialog(frame,"Enter A Word");
		if (val.length()==0) {
			change = false;
			System.out.println("Enter A String");
			Thread.sleep(2000);
		}
		else {
			change = true;	
			Thread.sleep(2000);
			System.out.println("Thank You");
		}
		}
		
		if (checker(val) == true) {
			System.out.println(val + " Is A PALINDROME");
		}
		else {
			System.out.println("This Is NOT a PALINDROME");
		}
		
		
	}
	
	public static void welcome()  throws IOException, InterruptedException {
		// welcome user
		System.out.println("Welcome to PALINDROME");
		Thread.sleep(3000);	
		System.out.println("Lets Start PALINDROME");
	}
	
	public static Boolean checker(String val) {
		String pal = val.toLowerCase();
		String newpal= "";
		char arr[] = pal.toCharArray();
		int length = pal.length();
		//check and remove white spaces
		for (int i =0; i< length; i++) {
			if (arr[i] == ' ') {
				
			}
			// convert char to string and concatenate
			else {
				String s = String.valueOf(arr[i]);
				newpal += s;
				
			}
		}
		//output new string
		System.out.println(newpal);
		//place string into Char array
		char newarr[] = newpal.toCharArray();
		// get length of new array
		int newlength = newpal.length();
		
		//compare characters
		int check = 0;
		
		if (newpal.length()%2 == 0){
			for (int i =0; i< newlength/2; i++) {
				if (newarr[i] == newarr[newlength-1-i]) {
					check++;
				}
				
			}
		}
		else {
			for (int i =0; i< (newlength-1)/2; i++) {
				if (newarr[i] == newarr[newlength-1-i]) {
					check++;
				}
			}
			
		}
		
		// return true if the number of same characters are equal to that of half the # of chars in string
		if (check == newlength/2) return true;
		
		return false;
	}
	

}
