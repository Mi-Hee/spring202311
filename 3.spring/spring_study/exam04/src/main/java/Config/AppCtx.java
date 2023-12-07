package Config;

import Models.Member.MemberDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

@Configuration // 설정클래스임을 알려줌
/*
@ComponentScan(value = "Models",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = ManualBean.class))

 */
/*
@ComponentScan(value = "Models",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = MemberDao.class))
 */
@ComponentScan(value = "Models",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ASPECTJ, pattern = "Models..*Dao"))
public class AppCtx {
    /*
    @Bean
    public MemberDao memberDao() { // 이름이 동일할 경우 수동 등록 빈이 자동 등록 빈보다 우선 순위에 있다.
        System.out.println("수동 등록 빈");
        return new MemberDao();
    }
     */
}
