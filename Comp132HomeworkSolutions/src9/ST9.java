
public class ST9 {
	public static boolean isPalindrome(String s) {
		boolean rtrn = true; // single char is palindrome
		for(int i = 0; i < s.length() / 2; i++) {
			rtrn = s.charAt(i) == s.charAt(s.length() - 1 - i);
			if(!rtrn) {break;}
		}
		return rtrn;
	}
	public static void main(String[] args) {
		System.out.println(isPalindrome("chc"));
	}
}
