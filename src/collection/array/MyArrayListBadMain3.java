package collection.array;

public class MyArrayListBadMain3 {
    public static void main(String[] args) {

        MyArrayListV3 numberList = new MyArrayListV3();

        //숫자만 입력 하기를 기대
        numberList.add(1);
        numberList.add(2);
        numberList.add("문자");

        //Object를 반환하므로 다운 캐스팅이 필요
        Integer num1 = (Integer) numberList.get(0);
        Integer num2 = (Integer) numberList.get(1);

        //실수로 문자를 Integer로 다운 캐스팅 할 때 ClassCaseException 발생(타입 안정성 문제)
        //Integer num3 = (Integer) numberList.get(2);

    }

}
