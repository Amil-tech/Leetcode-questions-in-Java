import java.util.HashMap;

public class Isomorphic {

	public static void main(String[] args) {
		System.out.println(isIsomorphic("badc", "baba"));
	}
	
    public static boolean isIsomorphic(String s, String t) {
    	
    	if(s.length() != t.length()) return false;
    	
        HashMap<Character, Character> map = new HashMap<>();
        
        for(int i = 0; i < s.length() ; i++) {
        	if(map.containsKey(s.charAt(i))) {
        		if(map.get(s.charAt(i)) == t.charAt(i)) {
        			continue;
        		}
        		else return false;
        	}
        	else {
        		if(!map.containsValue(t.charAt(i))) map.put(s.charAt(i), t.charAt(i));
        		else return false;
        	}
        }
        
        return true;
        
    }

}
