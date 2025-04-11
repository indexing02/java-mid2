package collection.deque.test;

import java.util.HashMap;

public class WordFrequencyTest {
    public static void main(String[] args) {
        //각각의 단어가 나타난 수 출력
        String text = "orange banana apple apple banana apple";

        // 코드 작성
        String[] words = text.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            //`getOrDefault()를 사용하면 키가 없는 경우 대신 사용할 기본 값 지정 가능
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println(map);
    }
}
