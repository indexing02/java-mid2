package collection.set;

import java.util.Arrays;

public class HashStart3 {
    public static void main(String[] args) {

        //메모리 낭비
        Integer[] inputArray = new Integer[100];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        inputArray[14] = 14;
        inputArray[99] = 99;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 99;
        //인덱스 활용 O(1)
        Integer result = inputArray[searchValue];
        System.out.println("result = " + result);
        


    }
}
