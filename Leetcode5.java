import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Leetcode5 {

	public static void main(String[] args) {
		List<Integer> array = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		System.out.println(permute(array).toString());
	}
	
	public static List<List<Integer>> permute(List<Integer> array){
		
		List<Integer> answer = new ArrayList<>();
		List<List<Integer>> res = new ArrayList<>();
		HashMap<Integer,Integer> map = new HashMap<>();
		
		part(array, res, answer,map);
		
		return res;
	}
	
	public static void part(List<Integer> array, List<List<Integer>> res, 
			List<Integer> answer, HashMap<Integer,Integer> map){
		if(answer.size() == array.size()) {
			res.add(new ArrayList<>(answer));
			return;
		}
		
		for(int i = 0; i < array.size() ; i++) {
			if(!map.containsKey(array.get(i))) {
				answer.add(array.get(i));
				map.put(array.get(i), 1);
			}
			else continue;
			part(array, res, answer,map);
			int removed = answer.remove(answer.size() - 1);
			map.remove(removed);
		}
	
	}
}