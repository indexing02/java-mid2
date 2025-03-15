package generic.test.ex3.unit;

public class UnitPrinter {

    public static <T extends BioUnit> void printV1(Shuttle<T> shuttle) {
        System.out.println("이름 : " + shuttle.out().getName() + ", HP: " + shuttle.out().getHp());
    }

    public static void printV2(Shuttle<? extends BioUnit> shuttle) {
        System.out.println("이름 : " + shuttle.out().getName() + ", HP: " + shuttle.out().getHp());
    }
}
