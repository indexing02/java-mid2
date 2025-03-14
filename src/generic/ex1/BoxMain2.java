package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.setValue(10);
        Integer integer = (Integer) integerBox.getValue();
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.setValue("hello");
        String string = (String) stringBox.getValue();
        System.out.println("string = " + string);

        //타입 안정성 문제 발생 - 잘못된 타입의 인수 전달
        //integerBox.setValue("문자");
        //Integer result = (Integer) integerBox.getValue(); //  String -> Integer 캐스팅 예외
        //System.out.println("result = " + result);

    }
}
