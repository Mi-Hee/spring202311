package Main;

import Config.AppCtx2;
import Models.Message;
import Models.Message2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex02 {
    public static void main(String[] args) {
        // 객체 생성, 의존 설정, 초기화(afterPropertiesSet)
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx2.class);

        // m1과 m2는 같은 객체를 참조한다.
        Message m1 = ctx.getBean(Message.class);
        Message m2 = ctx.getBean(Message.class);
        System.out.println(m1 == m2);

        ctx.close(); // 컨테이너 소멸 -> 이 전에 destroy() 호출
    }
}
