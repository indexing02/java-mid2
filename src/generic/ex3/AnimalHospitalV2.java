package generic.ex3;

public class AnimalHospitalV2<T> {

    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public void checkup(){
        // T의 타입을 메서드를 정의하는 시점에는 알수 없음 -> Object 기능만 사용가능
        // 컴파일 오류발생
        //  System.out.println("동물이름 : " + animal.getName());
        //  System.out.println("동물크기 : " + animal.getSize());
        //  animal.sound();
    }

    public T bigger(T target){
        //return  animal.getSize() > target.getSize() ? animal : target;
        return null;
    }
}
