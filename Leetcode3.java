import java.util.HashMap;

public class Leetcode3 {
	
	public static void main(String[] args) {
		
		System.out.println(lengthOfLongestSubstring(" "));
	}
	
	
    public static int lengthOfLongestSubstring(String s) {
    	int max = 0;
    	
    	for(int i = 0; i < s.length(); i++) {
    		HashMap<Character,Integer> map = new HashMap<>();
    		map.put(s.charAt(i), 1);
    		int current = 1;
    		for(int j = i + 1; j < s.length(); j++) {
    			char ch = s.charAt(j);
    			if(!map.containsKey(ch)) {
    				map.put(ch, 1);
    				current += 1;
    			}
    			else {
    				max = Math.max(max, current);
    				break;
    			}
    		}
    		max = Math.max(max, current);
    	}
    	
    	return max;
    	
    }

}
