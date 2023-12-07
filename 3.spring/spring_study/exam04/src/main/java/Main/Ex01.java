package Main;

import Config.AppCtx;
import Models.Member.JoinService;
import Models.Member.ListService;
import Models.Member.Member;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;

public class Ex01 {
    public static void main(String[] args) {
        // 스프링컨테이너 생성
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        // 생성한 컨네이너에서 꺼내와 사용함
        JoinService joinService = ctx.getBean(JoinService.class);
        ListService listService = ctx.getBean(ListService.class);

        Member member = new Member();
        // member에서 데이터 입력
        member.setUserId("userId");
        member.setUserPw("123456");
        member.setConfirmPw("123456");
        member.setUserNm("사용자01");
        member.setRegDt(LocalDateTime.now());

        joinService.join(member);

        listService.print();

        ctx.close();
    }
}



















