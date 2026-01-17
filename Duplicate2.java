import java.util.HashMap;

public class Duplicate2 {

	public static void main(String[] args) {
		
	}
	
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    	
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
        	
        	if(!map.containsKey(nums[i])) map.put(nums[i], i);
        	else {
        		if(i - map.get(nums[i]) <= k) return true;
        		else {
        			map.remove(nums[i]);
        			map.put(nums[i], i);
        		}
        	}
        }
        
        return false;
    }

}
