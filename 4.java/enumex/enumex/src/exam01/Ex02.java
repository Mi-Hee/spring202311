package exam01;

public class Ex02 {
    public static void main(String[] args) {
        String str = "TAXI";

        Trancportation trans = Enum.valueOf(Trancportation.class, str);
        System.out.println(trans);

        Trancportation trans2 = Trancportation.valueOf(str);
        System.out.println(trans == trans2);
    }
}
