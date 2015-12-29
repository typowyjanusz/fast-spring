package configuration;

import com.lyncode.jtwig.mvc.JtwigViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;

/**
 * Created by Janusz on 2015-12-29.
 */


@Configuration
public class WebPageConfiguration {

    @Bean
    public ViewResolver viewResolver(){
        JtwigViewResolver jtwigViewResolver = new JtwigViewResolver();
        jtwigViewResolver.setPrefix("classpath:views/");
        jtwigViewResolver.setSuffix(".twig");
        return jtwigViewResolver;
    }
}
