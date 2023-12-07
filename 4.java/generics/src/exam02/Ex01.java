package exam02;

public class Ex01 {
    public static void main(String[] args) {
        // Box<Apple> appleBox = new Box<Apple>(); -> 아래 코드처럼 뒤의 Apple 생략 가능
        Box<Apple> appleBox = new Box<>();
        appleBox.setItem(new Apple());

        Apple apple = appleBox.getItem(); // 타입 안정성, 형변환 X

        Box<Pear> pearBox = new Box<>();

    }
}
