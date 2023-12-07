package AopEx;

public class RecCalculator implements Calculator {
    @Override
    public long factorial(long num) {
        if (num < 1L) {
            return 1L;
        }

        return num * factorial(num - 1); // 재귀방식 (Recursive) : 잘못 작성하면 무한루프에 빠지기 때문에 멈출 수 있게 조건을 설정해야 한다..

    }
}
