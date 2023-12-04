package exam03;

public class B extends A {
    int numB = 20;

    public B () {
        super(); // 상위 클래스의 기본생성자 -> A클래스의 기본생성자 : A()
        System.out.println("B 생성자");
    }
}
