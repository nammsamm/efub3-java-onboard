package onboard;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {
    public static Integer[] solution(Integer[][] flipCards){
        Integer[] answer = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for(int i=0;i<10;i++) {
        	int start=flipCards[i][0];
        	int end=flipCards[i][1];
        	while(start<end) {
        		int num=answer[start];
        		answer[start]=answer[end];
        		answer[end]=num;
        		start++;
        		end--;
        	}
        }
        return answer;
    }
}
