package exam03;

public class C extends B {
    int numC = 30;

    public C () {
        super(); // 상위 클래스의 기본생성자 -> B클래스의 기본생성자 : B()
        System.out.println("C 생성자");
    }
}
