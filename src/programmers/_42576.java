package programmers;

import java.util.HashMap;
import java.util.Map;

//완주하지못한선수
/*
1. compietion을 list로 옮긴다.
2. completion을 한명씩 participant에 있나 비교한후 있으면 제거한다.
3. participant의 인원만큼 반복한 후
4. list에 남아있는 이름을 answer에 놓음

1. 정렬한다.
2. 배열이 같지 않으면
 */
public class _42576 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String,Integer> participantMap = new HashMap<>();

        //participant를 participantMap에 옮기는 과정, key값 (person)이 있으면 Integer 값을 +1해줌 없으면 등록
        for(String person : participant) {
            if (participantMap.containsKey(person)) {
                participantMap.put(person,participantMap.get(person)+1);
            } else {
                participantMap.put(person, 1);
            }
        }

        //완주한 사람의 Integer값은 -1 해준다.
        for(String finish : completion) {
            participantMap.put(finish, participantMap.get(finish) -1);
        }

        //한명만 완주를 못했으므로 Integer값이 여전히 1인사람이 완주를 못한것
        for(String person : participantMap.keySet()) {
            if (participantMap.get(person)==1) {
                answer = person;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        _42576 s = new _42576();
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        System.out.println(s.solution(participant, completion));
    }
}
