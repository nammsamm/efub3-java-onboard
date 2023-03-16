package onboard;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    public static List<Integer> solution(Integer hour, Integer minute){
        List<Integer> answer = new ArrayList<>();
        int time=hour*60+minute-45;
		if(time<0) hour=23; minute=time+60;
		else hour=time/60; minute=time%60;
        answer.add(hour); answer.add(minute);
        return answer;
    }
}
