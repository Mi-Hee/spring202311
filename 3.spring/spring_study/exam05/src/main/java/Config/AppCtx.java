package Config;

import AopEx.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx {

    @Bean
    public Calculator ReCalculator() {
        return new RecCalculator();
    }
}
