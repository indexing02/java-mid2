package collection.deque.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {
        //영어 단어를 입력하면 한글 단어를 찾아주는 영어 사전 만들기
        Map<String, String> map = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("==단어 입력 단계==");
        while (true) {
            System.out.print("영어 단어를 입력하세요 (종료는 'q'): ");
            String englishWord = scanner.nextLine();
            if (englishWord.equals("q")) {
                break;
            }
            System.out.print("한글 뜻을 입력하세요 : ");
            String word = scanner.nextLine();
            map.put(englishWord, word);
        }

        System.out.println("==단어 검색 단계==");

        while (true) {
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
            String englishWord = scanner.nextLine();
            if (englishWord.equals("q")) {
                break;
            }

            if(map.containsKey(englishWord)) {
                System.out.println(englishWord + "의 뜻 : " + map.get(englishWord));
            }else{
                System.out.println(englishWord + "은(는) 사전에 없는 단어입니다.");
            }
        }

    }
}
