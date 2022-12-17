package programmers;

import java.util.Arrays;

//제일 작은 수 제거하기
/*
1. 주어진 배열을 오른차순 정렬한다.
2. 배열의 마지막에서 첫번째값을 제외하고 하나씩 값을 넣는다.
--> 배열의 순서를 바꾸면 안되는 것 같음.

1. 최소값을 stream으로 찾는다.
2. 찾은 최소값은 continue로 넘기고 나머지는 answer값에 넣는다.
 */
public class _12935 {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[] {-1};
        int[] answer = new int[arr.length-1];
        int min = Arrays.stream(arr).min().getAsInt();
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if(min == arr[i]) {
                continue;
            } else {
                answer[idx++] = arr[i];
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        _12935 s = new _12935();

        int[] arr = {4,3,2,1};
        int[] arr1 = {10};
        System.out.println(Arrays.toString(s.solution(arr)));
        System.out.println(Arrays.toString(s.solution(arr1)));
    }
}
