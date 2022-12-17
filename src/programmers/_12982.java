package programmers;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

//예산
/*
부서별 신청 금액이 들어있는 배열 d
예산이 적힌 budget
최대 몇개의 부서에 지원해줄수있는지 => 결과

최대 몇개의 부서인지니까
가장 지원금액이 낮은 부서들 순으로 하나씩더해서 budget을 넘기면 카운트 stop
 */
public class _12982 {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            if(budget >= d[i]) {
                budget = budget - d[i];
                answer ++;
            } else break;
        }
        return answer;
    }

    public static void main(String[] args) {
        Instant start = Instant.now();
        _12982 s = new _12982();

        int[] d = {1,3,2,5,4};
        int budget = 9;

        System.out.println("result = "+s.solution(d, budget));

        Instant end = Instant.now();
        System.out.println("수행시간: " + Duration.between(start, end).toMillis() + " ms");
    }
}
