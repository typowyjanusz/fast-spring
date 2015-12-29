import configuration.WebPageConfiguration;
import controller.PageController;
import model.Beer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by Janusz on 2015-12-13.
 */

@EnableAutoConfiguration
@ComponentScan(basePackageClasses = {Beer.class, PageController.class, WebPageConfiguration.class})
@EnableJpaRepositories(basePackages = "repo")
@EntityScan
public class Application {

    public static void main(String[] args){

        SpringApplication.run(Application.class, args);
    }
}
