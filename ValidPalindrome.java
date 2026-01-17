
public class ValidPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome("race car"));
	}
	
    public static boolean isPalindrome(String s) {
    	
        s = s.toLowerCase();
        String result = "";
        String alphanumeric = "qwertyuiopasdfghjklzxcvbnm1234567890";
        
        for(int i = 0; i < s.length(); i++) {
        	if (alphanumeric.indexOf(s.charAt(i)) != -1){
        		result += String.valueOf(s.charAt(i));
        	}
        }
        
        if(result == "") return true;
        
        String reversed = new StringBuilder(result).reverse().toString();
        System.out.println(result);
        System.out.println(reversed);
        
        return result.equals(reversed);
        
    }

}
