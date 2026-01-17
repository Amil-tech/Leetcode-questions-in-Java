
public class HammingWeight {

	public static void main(String[] args) {
		System.out.println(hammingWeight(2147483645));
	}
	
	
    public static int hammingWeight(int n) {
    	
        String str = "";
        int result = 0;
        
        while(n > 0) {
        	int remainder = n % 2;
        	str = String.valueOf(remainder) + str;
        	n = (int) n/2;
        }
        
        for(int i = 0; i < str.length(); i++) {
        	int num = Integer.valueOf(String.valueOf(str.charAt(i)));
        	if(num == 1) result++;
        }
        
        return result;
    }

}
