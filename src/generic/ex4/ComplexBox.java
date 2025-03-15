package generic.ex4;

import generic.animal.Animal;

public class ComplexBox <T extends Animal>{

    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    // 제네릭 타입과 제네릭 메서드의 타입 매개변수 이름이 같을 때 제네릭 메서드가 우선순위를 가짐
    public <T> T printAndReturn(T t){
        System.out.println("animal.className : " + animal.getClass().getName());
        System.out.println("t.className : " + t.getClass().getName());
        return t;
    }
}
