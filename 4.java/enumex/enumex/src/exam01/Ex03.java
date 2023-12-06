package exam01;

public class Ex03 {
    public static void main(String[] args) {
        System.out.println(Trancportation.BUS instanceof Trancportation);

        int totalFare = Trancportation.BUS.getTotal(10);
        System.out.println(totalFare);
    }
}
