package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class wildCardMain2 {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        //Animal 포함 상위 타입만 전달 가능
        writeBox(objectBox);
        writeBox(animalBox);

        Animal animal = animalBox.getValue();
        System.out.println(animal);

    }

    //하한 와일드 카드
    static void writeBox(Box<? super Animal> box){
        box.setValue(new Dog("멍멍이" , 100));
    }
}
