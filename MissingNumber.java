import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		
	}
	
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] != 1) {
                return nums[i] + 1;
            }
        }

        boolean answer = Arrays.stream(nums).anyMatch(num -> num == nums.length);
        if (answer) return 0;
        else return nums.length;
    }
    
    public int missingNumber2(int[] nums) {
        int n = nums.length;
        int[] v = new int[n+1];
        Arrays.fill(v, -1);
        for(int i = 0; i < nums.length; i++) {
            v[nums[i]] = nums[i];
        }
        for(int i = 0; i < v.length; i++) {
            if(v[i] == -1) return i;
        }
        return 0;
    }
    
}


