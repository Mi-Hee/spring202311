package exam01;

public class Ex03 {
    public static void main(String[] args) {
        try (MyResource my = new MyResource()) {
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ex03 - Exception e 오류 발생");
        }
    }
}
