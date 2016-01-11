package configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;



/**
 * Created by Janusz on 2016-01-03.
 */
@Configuration
@EnableWebMvcSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

    @Autowired
    DataSource dataSource;

    @Autowired
    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception{

        auth.jdbcAuthentication().dataSource(dataSource)
                .usersByUsernameQuery("select username, password from users where username=?")
                .authoritiesByUsernameQuery("select username, role from user_roles where username=?");

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http
                .authorizeRequests()
                .antMatchers("/logged").access("hasRole('ROLE_ADMIN')")
                .antMatchers("/db2").access("hasRole('ROLE_USER')")
                .anyRequest().permitAll()
                .and()
        .formLogin()
                .usernameParameter("username").passwordParameter("password")
                .and()
        .logout().logoutSuccessUrl("/login?logout")
                .and()
        .exceptionHandling().accessDeniedPage("/403")
                .and()
                .csrf();
    }


}
