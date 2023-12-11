package exam02;

public class Box<T extends Fruit> { // T : 지네릭 클래스의 타입 매개변수
    private T item; // Object

    // private static T item2;
    // private T[] item3 = new T[];

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void printItem() {
        // T -> Object, 객체를 만드는 시점 -> 투입된 타입으로 형변환
        // T -> Fruit, 객체를 만드는 시점 -> 투입된 타입으로 형변환
        item.print();
    }
    
    public <T> void testMethod(T t) { // T : 지네릭 메서드 - 메서드가 호출될 때 타입이 결정된다.
        
    }
}
