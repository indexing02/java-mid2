package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {
    public static void main(String[] args) {
        // 불변 리스트 -> 가변 리스트 전환
        List<Integer> list = List.of(1, 2, 3);

        ArrayList<Integer> mutableList = new ArrayList<>(list);
        mutableList.add(4);
        System.out.println("mutableList = " + mutableList);
        System.out.println("mutableList.getClass() = " + mutableList.getClass());

        // 가변 리스트 -> 불변 리스트 전환
        List<Integer> unmodifiableList = Collections.unmodifiableList(mutableList);
        // unmodifiableList.add(5); 예외발생
        System.out.println("unmodifiableList.getClass() = " + unmodifiableList.getClass());
    }
}
