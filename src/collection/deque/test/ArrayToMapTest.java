package collection.deque.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {
    public static void main(String[] args) {
        //2차원 배열 Map으로 전환
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};

        // 주어진 배열로부터 Map 생성 - 코드 작성
        Map<String,Integer > produtMap = new HashMap<>();
        for (String[] product : productArr) {
            produtMap.put(product[0], Integer.valueOf(product[1]));
        }

        // Map의 모든 데이터 출력 - 코드 작성
        for (String string : produtMap.keySet()) {
            System.out.println("제품:" + string + ", 가격:" + produtMap.get(string));
        }
    }
}
