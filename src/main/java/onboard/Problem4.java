package onboard;
/**
 * 리턴값 answer의 경우, 변수 초기값은 변경 가능합니다.
 * 다만 answer로 return하는 것은 변경하지 않도록 주의해주세요.
 */
public class Problem4 {
    public static Integer solution(Integer number){
        Integer answer = 0;
        int ten=1;
        int j=0;
        List<Integer> numbers=new ArrayList<>();
        while(number!=0) {
        	numbers.add(number%10);
        	number/=10;
        	ten*=10;
        	j++;
        }
        Collections.sort(numbers, Collections.reverseOrder());
        for(int i=0;i<j;i++) {
        	ten/=10;
        	answer+=(numbers.get(i))*ten;
        }
        return answer;
    }
}
