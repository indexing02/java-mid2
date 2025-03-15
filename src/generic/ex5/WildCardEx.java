package generic.ex5;

import generic.animal.Animal;

public class WildCardEx {

    // 제네릭 메서드 - Box<Dog> dogBox 전달 시 타입 추론에 의해 T가 Dog가 됨
    static <T> void printGenericV1(Box<T> box){
        System.out.println("T = " + box.getValue());
    }

    // 일반적인 메서드 - 와일드카드 ?는 모든 타입을 받을 수 있음
    static void printWildcardV1(Box<?> box){
        System.out.println("? = " + box.getValue());
    }

    static <T extends Animal> void printGenericV2(Box<T> box){
        T t = box.getValue();
        System.out.println("이름 = " + t.getName());
    }

    static void printWildcardV2(Box<? extends Animal> box){
        Animal animal = box.getValue();
        System.out.println("이름 = " + animal.getName());
    }

    static <T extends Animal> T printAndReturnGeneric (Box<T> box){
        T t = box.getValue();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    static Animal printAndReturnWildcard (Box<? extends Animal> box){
        Animal animal = box.getValue();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }
}
