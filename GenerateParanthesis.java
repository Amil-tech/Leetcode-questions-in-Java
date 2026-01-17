import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {

	public static void main(String[] args) {
		
	}
	
	// Okay, i know myself, that i will forget this algorithm anyway. So here is a note:
	// We can only add ")"  without exceeding the number of "(" you idiot, do not waste
	// your fucking time on that. 

    public List<String> generateParenthesis(int n) {
    	
        List<String> result = new ArrayList<String>();
        backtrack(result, "", 0, 0, n);
        return result;
        
    }
    
    public void backtrack(List<String> result, String answer, int NumOfOpen, int NumOfClose, int n) {
    	
    	if(answer.length() == n * 2) {
    		result.add(answer);
    	}
    	
    	if(NumOfOpen < n) {
    		backtrack(result, answer + "(", NumOfOpen + 1, NumOfClose, n);
    	}
    	
    	if(NumOfOpen > NumOfClose) {
    		backtrack(result, answer + ")", NumOfOpen, NumOfClose + 1, n);
    	}
    	
    	
    }
    
    
}
