package generic.test.ex1;

public class ContainerTest {
    public static void main(String[] args) {

        Container<String> StringContainer = new Container<>();
        System.out.println("빈값 확인1 : " + StringContainer.isEmpty());

        StringContainer.setItem("data1");
        System.out.println("저장 데이터 : " + StringContainer.getItem());
        System.out.println("빈값 확인2 : " + StringContainer.isEmpty());

        Container<Integer> integerContainer = new Container<>();
        integerContainer.setItem(10);
        System.out.println("저장 데이터 : " + integerContainer.getItem());


    }
}
