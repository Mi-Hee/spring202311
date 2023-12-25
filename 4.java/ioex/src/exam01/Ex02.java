package exam01;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("test01.txt")) {
            while (fis.available() > 0) {
                System.out.println((char) fis.read());
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ex02 - IOException 오류 발생");
        }
    }
}
