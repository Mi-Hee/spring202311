package exam01;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("test01.txt")) {
            int ch = 0;
            while((ch = fis.read()) != -1) {
                System.out.println((char) ch);
            }
//            char ch = (char) fis.read(); // 1바이트 읽기 char(2byte, 3byte) - 양의 정수
//            System.out.println(ch);
//
//            ch = (char) fis.read(); // 호출할 때마다 1바이트 읽기
//            System.out.println(ch);
//
//            ch = (char) fis.read();
//            System.out.println(ch);
//
//            ch = (char) fis.read();
//            System.out.println(ch);
//
//            ch = (char) fis.read();
//            System.out.println(ch);
//
//            ch = (char) fis.read(); // -1
//            System.out.println(ch);


        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ex01 - IOException 오류 발생");
        }
    }
}
