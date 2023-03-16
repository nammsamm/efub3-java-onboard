package onboard;

public class Problem5 {
    public static Integer solution(Integer N, Integer K, Integer[] values){
        Integer answer = 0;
        int coin=N-1;
        while(true) {
        	if(K<values[coin]) coin--;
        	else if(K==values[coin]) break;
        	else break;
        }
        while(K>0) {
        	if(K>=values[coin]) {
        		answer+=K/values[coin];
        		K=K-values[coin]*(K/values[coin]);
        	}
        	coin--;
        	if(coin<0) break;
        }
        return answer;
    }
}
