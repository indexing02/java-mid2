package collection.set.member;

import collection.set.MyHashSetV2;

//equals 중요성
public class HashAndEqualMain2 {
    public static void main(String[] args) {
        //equals()를 재정의 하지 않아 인스턴스의 참조값으로 비교하므로 비교에 실패함
        //중복 데이터가 없다고 생각하여 중복저장
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberOnlyHash m1 = new MemberOnlyHash("A");
        MemberOnlyHash m2 = new MemberOnlyHash("A");

        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        set.add(m1);
        set.add(m2);
        System.out.println(set);

        // 검색 실패
        MemberOnlyHash searchValue = new MemberOnlyHash("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean result = set.contains(searchValue);
        System.out.println("result = " + result);

    }
}
