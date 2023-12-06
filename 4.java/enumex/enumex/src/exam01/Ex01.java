package exam01;

import static exam01.Trancportation.*;
public class Ex01 {
    public static void main(String[] args) {
        Trancportation bus = Trancportation.BUS;
        System.out.println(BUS == Trancportation.BUS);
        System.out.printf("ordival() : %d, name() : %s%n", bus.ordinal(), bus.name());
    }
}
