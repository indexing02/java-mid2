package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV2 {
    public static void main(String[] args) {

        // Animal이나 그 자식을 타입 인자로 제한하고 싶은데,
        // 제네릭에서 타입 매개변수를 사용하여 어떤 타입이든 수용하는 문제가 발생
        // -> 타입 매개변수 제한이 필요
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> objectHospital = new AnimalHospitalV2<>();

    }
}
