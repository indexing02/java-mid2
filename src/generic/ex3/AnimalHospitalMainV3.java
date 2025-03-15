package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();
        //Animal 자식이 아닌 다른 타입이 들어오는 문제 해결
        //AnimalHospitalV3<Integer> integerHospital = new AnimalHospitalV3<>(); -> 컴파일 오류 발생

        Dog dog = new Dog("멍멍이1",100);
        Cat cat = new Cat("냐옹이1",300);

        //개 병원
        dogHospital.setAnimal(dog);
        dogHospital.checkup();

        //고양이 병원
        catHospital.setAnimal(cat);
        catHospital.checkup();

        //문제1 : 개 병원에 고양이 전달
        //dogHospital.setAnimal(cat); // -> 매개변수 체크 성공 : 컴파일 오류 발생

        //문제2 : 개 타입 반환 -> 다운캐스팅 불필요
        dogHospital.setAnimal(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2",200));
        System.out.println("biggerDog = " +  biggerDog);

    }
}
