import java.util.HashMap;
import java.util.HashSet;

public class WordPattern {
	
	public static void main(String[] args) {
		
	}
	
    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> usedValues = new HashSet<>(); 
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (map.containsKey(c)) {
                if (!map.get(c).equals(word)) return false;
            } else {
                if (usedValues.contains(word)) return false;
                map.put(c, word);
                usedValues.add(word);
            }
        }
        return true;
    }

}
