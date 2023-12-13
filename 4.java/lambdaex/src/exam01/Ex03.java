package exam01;

public class Ex03 {
    public static void main(String[] args) {
        /* 1.
        Calculator cal = new Calculator() {
            @Override
            public int square(int num) {
                return 0;
            }
        };
         */
        /* 2.
        Calculator cal = (int num) -> {
            return num * num;
        };
         */
        /* 3.
        Calculator cal = (num) -> num * num;
         */
        // 4. 최종 람다식
        Calculator cal = x -> x * x;

        int result = cal.square(10);
        System.out.println(result);
    }
}


























