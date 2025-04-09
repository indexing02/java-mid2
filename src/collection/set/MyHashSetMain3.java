package collection.set;

import collection.set.member.Member;

public class MyHashSetMain3 {
    public static void main(String[] args) {
        MySet<String> set = new MyHashSetV3<>(10);

        //set에 데이터 추가
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set);

        //검색
        String searchValue = "A";
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" +  searchValue + ") = " + result);

    }
}
