package generic.ex1;

public class RowTypeMain {
    public static void main(String[] args) {

        // row type : 제네릭 사용시 <>에 타입을 지정하지 않은 것
        // 타입 지정 생략시 Object로 사용됨
        GenericBox integerBox = new GenericBox();
        //GenericBox<Object> integerBox = new GenericBox<>(); 권장
        integerBox.setValue(10);
        Integer result = (Integer) integerBox.getValue();
        System.out.println("result = " + result);
    }
}
