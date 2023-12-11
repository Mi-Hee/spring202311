package Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration // 설정 파일임을 알려줌
@Import(DbConfig.class)
public class AppCtx {

}
