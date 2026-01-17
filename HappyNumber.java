import java.util.HashMap;

public class HappyNumber {

	public static void main(String[] args) {
		
		System.out.println(isHappy(19));

	}
	
	
    public static boolean isHappy(int n) {
    	
        HashMap<Integer, Integer> map = new HashMap<>();
        while(true) {
        	
        	if(sumUpItsNumbers(n) == 1) {
        		return true;
        	}
        	if(map.containsKey(sumUpItsNumbers(n))) {
        		return false;
        	}
        	else {
        		n = sumUpItsNumbers(n);
        		map.put(n, 1);
        	}
        	
        }
        
        
    }
    
    public static int sumUpItsNumbers(int num) {
    	
    	String str = String.valueOf(num);
    	int result = 0;
    	for(int i = 0; i < str.length(); i++) {
    		int reqem = Integer.valueOf(String.valueOf(str.charAt(i)));
    		reqem *= reqem;
    		result = result + reqem;
    	}
    	return result;
    }

}
