package Main;

import Config.AppCtx;
import Config.AppCtx2;
import Config.AppCtx3;
import Models.Member.JoinService;
import Models.Member.ListService;
import Models.Member.Member;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;

public class Ex01 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx4.class);

        // getBean() :
        // JoinService joinService = ctx.getBean("joinService", JoinService.class);
        JoinService joinService = ctx.getBean(JoinService.class);
        // ListService listService = ctx.getBean("listService", ListService.class);
        ListService listService = ctx.getBean(ListService.class);

        Member member = new Member();
        member.setUserId("user01");
        member.setUserPw("123456");
        member.setConfirmPw("123456");
        member.setUserNm("사용자01");
        member.setRegDt(LocalDateTime.now());

        joinService.join(member);

        listService.print();

        ctx.close();
    }
}
























