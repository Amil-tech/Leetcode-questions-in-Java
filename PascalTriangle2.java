import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle2 {

	public static void main(String[] args) {
		
		

	}
	
	
    public List<Integer> getRow(int rowIndex) {
    	
    	int numRows = rowIndex + 1;
    	
    	List<List<Integer>> result = new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(1))));
    	
    	List<Integer> row = new ArrayList<>(Arrays.asList(1,1));
    	
    	while(numRows > 1) {
    		
    		result.add(new ArrayList<>(row));
    		
    		int left = 0;
    		int right = 1;
    		int position = 1;
    		ArrayList<Integer> temp = new ArrayList<>(Arrays.asList(1,1));
    		
    		while(right < row.size()) {
    			int sum = row.get(left) + row.get(right);
    			temp.add(position, sum);
    			left++;
    			right++;
    		}
    		
    		row.clear();
    		row.addAll(temp);
    		
    		numRows--;
    	}
    	
    	return result.get(rowIndex);
    	
    }
    

}
