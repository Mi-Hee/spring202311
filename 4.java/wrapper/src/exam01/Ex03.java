package exam01;

public class Ex03 {
    public static void main(String[] args) {
        // num1과 num2는 같은 자료형이 아니다.
        int num1 = 100; // 기본자료형
        Integer num2 = new Integer(200); // 참조자료형
        
        // num1이 Integer로 자동 형변환 된다.
        int num3 = num1 + num2; // num2.intValue() - 컴파일러에서 자동 추가
        System.out.println(num3);

        // Integer.valueOf(num3) - 컴파일러가 자동으로 추가한다.
        Integer num4 = num3;
    }
}












