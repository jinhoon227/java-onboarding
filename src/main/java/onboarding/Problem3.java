package onboarding;

public class Problem3 {
    public static int solution(int number) {
        int answer = 0;
        int num;
        int tmp;

        // count 3, 6, 9
        for(int i=1; i<= number; i++){
            num = i;
            while(num > 0){
                tmp = num % 10;
                if((tmp == 3) || (tmp == 6) || (tmp == 9))
                    answer++;
                num /= 10;
            }
        }
        return answer;
    }
}
