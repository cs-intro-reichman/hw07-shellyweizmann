/** Checks if a given string is a palindrome. */
public class Palindrome {

	public static void main(String[]args) {
		//System.out.println(args[0]);
    	System.out.println(isPalindrome(args[0]));
    }
	
	/** Checks if the given string is a palindrome. */
	public static boolean isPalindrome(String s) {
		//System.out.println(s);
		//System.out.println(s.length());
		if (s.length()<=1){
			return true;
		}
		//System.out.println(s.charAt(0));
		//System.out.println(s.charAt(s.length()-1));
		if(s.charAt(0) != s.charAt(s.length()-1)){
			return false;
		}
		//System.out.println(s.substring(1, s.length()-1));
		return isPalindrome(s.substring(1, s.length()-1));
	}
}
