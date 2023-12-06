package Config;

import Models.Member.JoinService;
import Models.Member.JoinValidator;
import Models.Member.ListService;
import Models.Member.MemberDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AppCtx3.class})
public class AppCtx2 {

    @Bean
    public JoinValidator joinValidator() {
        return new JoinValidator();
    }

    @Bean
    public JoinService joinService() {
        return new JoinService();
    }

    @Bean
    public ListService listService() {
        return new ListService();
    }
}














