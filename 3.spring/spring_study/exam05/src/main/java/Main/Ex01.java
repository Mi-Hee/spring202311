package Main;

import AopEx.*;
import Config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class Ex01 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        Calculator cal = ctx.getBean(Calculator.class); // Proxy 객체
        long result1 = cal.factorial(10L);
        System.out.printf("cal : %d%n", result1);

        long result2 = cal.factorial(10L);
        System.out.printf("cal : %d%n", result2);

        long result3 = cal.factorial(10L);
        System.out.printf("cal : %d%n", result3);

        long result4 = cal.factorial(10L);
        System.out.printf("cal : %d%n", result4);

        ctx.close();
    }
}
