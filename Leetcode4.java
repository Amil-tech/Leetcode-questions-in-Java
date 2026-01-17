
public class Leetcode4 {
	
	public static void main(String[] args) {
		System.out.println(longestPalindrome("cbbd"));
		//System.out.println(slidingWindow("babad",5));
	}
	
	public static boolean checkIfPalindrome(String s) {
		StringBuilder str = new StringBuilder(s);
		str.reverse();
		if (str.toString().equals(s)) {
			return true;
		}
		return false;
	}
	
	
	public static String slidingWindow(String s,int k){
		int left = 0;
		int right = left + k - 1;
		while(right < s.length()) {
			String str = s.substring(left, right + 1);
			if(checkIfPalindrome(str)) return str;
			left += 1;
			right += 1;
		}
		return "";
	}
	
	
	public static String longestPalindrome(String s) {
        int len = s.length();
        String answer = "";
        while (len >= 1) {
        	answer = slidingWindow(s,len);
        	if(!answer.equals("")) return answer;
        	len -= 1;
        }
        return "";
    }
	
	

}
