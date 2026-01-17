import java.util.HashMap;

public class Leetcode1 {
	
	public static void main(String args[]) {
		
	}
	
	public static int[] findTargetSum(int[] nums, int target) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0; i < nums.length ; i++) {
			int wanted = target - nums[i];
			if(map.containsKey(wanted)) {
				return new int[] {i,map.get(wanted)};
			}
			else {
				map.put(nums[i], i);
			}
		}
		return new int[] {};
		
	}

}
