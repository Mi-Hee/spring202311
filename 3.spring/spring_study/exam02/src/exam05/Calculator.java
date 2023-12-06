package exam05;

public interface Calculator {
    int num = 10; // 인터페이스 변수는 변수가 아니고 정적 상수이다.
                  // public static final 생략되어 있음
    int add(int num1, int num2); // public abstract

    default int minus(int num1, int num2) {
        return num1 - num2;
    }



}
