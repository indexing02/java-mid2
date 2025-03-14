package generic.ex1;

public class BoxMain1 {
    public static void main(String[] args) {

        IntegerBox integerBox = new IntegerBox();
        integerBox.setValue(10); //오토박싱
        Integer integer = integerBox.getValue();
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.setValue("Hello");
        String string = stringBox.getValue();
        System.out.println("string = " + string);

    }
}
