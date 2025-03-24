package collection.set;

import java.util.Arrays;

public class HashStart2 {
    public static void main(String[] args) {

        //인덱스 사용 - 데이터 값을 인덱스로 사용해서 저장
        Integer[] inputArray = new Integer[10];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 8;
        //인덱스 활용 O(1)
        Integer result = inputArray[searchValue];
        System.out.println("result = " + result);
        


    }
}
