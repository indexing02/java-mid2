package collection.link;

public class MyLinkedListMain2 {
    public static void main(String[] args) {
        MyLinkedListV2 list = new MyLinkedListV2();
        System.out.println("==마지막에 데이터 추가O(n)==");
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        System.out.println("==첫 번째 항목에 추가O(1)==");
        list.add(0,"d");
        System.out.println(list);

        System.out.println("==첫 번재 항목에 삭제O(1)==");
        list.remove(0);
        System.out.println(list);


        System.out.println("==특정(중간) 항목에 추가O(n)==");
        list.add(1,"e");
        System.out.println(list);

        System.out.println("==특정(중간) 항목에 삭제O(n)==");
        list.remove(1);
        System.out.println(list);




    }
}
