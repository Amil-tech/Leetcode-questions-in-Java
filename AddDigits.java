
public class AddDigits {

	public static void main(String[] args) {
		

	}
	
    public int addDigits(int num) {
    	
        while(String.valueOf(num).length() != 1) {
        	int cem = 0;
        	while(num > 0) {
        		int q = num % 10;
        		cem += q;
        		num = (int)(num / 10);
        	}
        	num = cem;
        }
        return num;
        
    }

}
