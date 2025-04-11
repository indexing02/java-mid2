package collection.deque.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemPriceTest {
    public static void main(String[] args) {
        //Map에 들어있는 데이터 중 값이 1000원이 상품 출력
        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나",500);
        map.put("망고", 1000);
        map.put("딸기", 1000);

        // 코드 작성
        List<String> list = new ArrayList<>();

        for (String product : map.keySet()) {
            if(map.get(product) == 1000){
                list.add(product);
            }
        }
        System.out.println(list);
    }
}
