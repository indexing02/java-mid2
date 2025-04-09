package collection.set.test;

import java.util.HashSet;
import java.util.Set;

public class UniqueNamesTest1 {
    public static void main(String[] args) {
        
        //중복 제거하여 출력하기, 순서 유지 X
        Integer[] inputArr = {30, 20, 20, 10, 10};
        Set<Integer> set = new HashSet<>();

        for (Integer integer : inputArr) {
            set.add(integer);
        }

        System.out.println("set = " + set);
    }
}
