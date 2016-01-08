import configuration.WebPageConfiguration;
import controller.PageController;
import model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Created by Janusz on 2015-12-13.
 */

@EnableAutoConfiguration
@ComponentScan(basePackageClasses = {Content.class, Beer.class, Task.class, PageController.class, WebPageConfiguration.class})
@EnableJpaRepositories(basePackages = "repo")
@EntityScan
@SpringBootApplication
public class Application {




    public static void main(String[] args){

        SpringApplication.run(Application.class, args);
    }




    }



