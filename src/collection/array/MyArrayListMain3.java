package collection.array;

public class MyArrayListMain3 {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        System.out.println("==마지막에 추가O(1)==");
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        System.out.println("==원하는 위치에 추가==O(1)");
        list.add(3,"addList");
        System.out.println(list);

        System.out.println("==첫번째 위치에 추가O(n)==");
        list.add(0, "addFirst");
        System.out.println(list);

        System.out.println("==마지막 위치 삭제O(1)");
        list.remove(4);
        System.out.println(list);

        System.out.println("==첫번째 위치 삭제O(n)");
        list.remove(0);
        System.out.println(list);
    }
}
