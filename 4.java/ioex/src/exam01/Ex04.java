package exam01;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) {
        byte[] buffer = new byte[5];
        
        try (FileInputStream fis = new FileInputStream("test02.txt")) {
            while (fis.available() > 0) {
                int ch = fis.read(buffer); // ch : 현재 읽어온 바이트 개수
                // System.out.println(ch);

                for (int i = 0; i < buffer.length; i++) {
                    System.out.print((char) buffer[i]);
                }

                System.out.println();

            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ex04 - IOException 오류 발생");
        }
    }
}
