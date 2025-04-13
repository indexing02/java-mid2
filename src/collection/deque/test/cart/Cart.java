package collection.deque.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Product, Integer> cartMap = new HashMap<>();

    // 코드 작성
    public void add(Product product, int i) {
        if (!cartMap.containsKey(product)) {
            cartMap.put(product, i);
        }else{
            cartMap.put(product, cartMap.get(product) + i);
        }
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Map.Entry<Product, Integer> entry : cartMap.entrySet()) {
            System.out.println("상품 : " + entry.getKey() + "수량: " + entry.getValue());
        }
    }

    public void minus(Product product, int i) {

        if (cartMap.containsKey(product)) {
            cartMap.put(product, cartMap.get(product) - i);
            if(cartMap.get(product) == 0){
                cartMap.remove(product);
            }
        }

    }
}
