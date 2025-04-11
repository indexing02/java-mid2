package collection.deque.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CommonKeyValueSum1 {
    public static void main(String[] args) {
        //map1과 map2의 공통으로 들어있는 키를 찾고 그 값의 합 구하기
        //`Map' 을 생성할 때 `Map.of()` 를 사용하면 편리하게 `Map` 생성 가능
        //Map.of()를 사용해서 생성한 `Map` 은 불변으로 변경 불가능

        Map<String, Integer> map1 = Map.of("A", 1, "B", 2, "C", 3);
        Map<String, Integer> map2 = Map.of("B", 4, "C", 5, "D", 6);

        // 코드 작성
        Map<String, Integer> result = new HashMap<>();

        for (String key : map1.keySet()) {
            if(map2.containsKey(key)) {
                result.put(key, map1.get(key) + map2.get(key));
            }
        }

        System.out.println(result);

    }
}
