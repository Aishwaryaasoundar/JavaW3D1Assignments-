package Week3;

public class Palindrome {
	/*
	 * Pseudo Code
	
	 * a) Declare A String value as"madam"
	 
	 * b) Declare another String rev value as ""
	 * c) Iterate over the String in reverse order
	 * d) Add the char into rev
	 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
	 
	 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
	 */
public static void main(String[] args) {
	


	String str= "MadAm";
    String reversestr="";
    for(int i=str.length()-1;i>=0;i--) {
        reversestr=reversestr+str.charAt(i);
    }if(str.equalsIgnoreCase(reversestr)) {
        System.out.println("its the palindrome string");
    }else {
        System.out.println("its not palinrome string");
    }
}
}
