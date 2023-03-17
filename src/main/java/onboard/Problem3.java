package onboard;

import java.util.ArrayList;
import java.util.List;

public class Problem3 {
    public static List<Integer> solution(List<Integer> numbers){
	        List<Integer> answer = new ArrayList<>();
	        Collections.sort(numbers);
	        int avg=numbers.get(2);
	        int sum=0;
	        for(int i=0;i<5;i++) {
	        	sum+=numbers.get(i);
	        }
	        answer.add(sum/5);
	        answer.add(avg); 
	        
	        return answer;
	    }
}
