package collection.link;

public class MyLinkedListMain1 {
    public static void main(String[] args) {
        MyLinkedListV1 list = new MyLinkedListV1();
        System.out.println("==데이터 추가==");
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);

        System.out.println("==기능 사용==");
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.indexOf('c') = " + list.indexOf("c"));
        System.out.println("list.set(2,'z') = " + list.set(2, "z"));
        System.out.println(list);

        //연결 리스트는 데이터를 추가할 때 동적으로 노드가 늘어나기 때문에
        // 범위초가 문제가 발생하지 않음
        System.out.println("==데이터 추가==");
        list.add("d");
        System.out.println(list);
        list.add("e");
        System.out.println(list);
        list.add("f");
        System.out.println(list);
    }
}
