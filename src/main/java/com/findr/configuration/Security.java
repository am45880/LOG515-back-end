package com.findr.configuration;

import com.findr.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


/**
 * Created by Yassine on 2017-03-24.
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled=true)
public class Security extends WebSecurityConfigurerAdapter {

    @Autowired
    private Environment env;

    @Autowired
    private UserAuthService authService;

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
       auth.userDetailsService(this.authService).passwordEncoder(User.PASSWORD_ENCODER);
    }

    private static final String[] PUBLIC_MATCHERS = {
            "/auth/login",
            "/images/**",
    };

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        System.out.println("********************* Security configuration !!!!!!");

        http
                .authorizeRequests().
//                antMatchers("/**").
                antMatchers(PUBLIC_MATCHERS).
                permitAll().anyRequest().authenticated();

        http

                // on authaurise les accée sur les ressources css , js et images qui est authentifier
                .authorizeRequests()
                .antMatchers("/**").permitAll()
                .anyRequest()
                .authenticated();

        http
                .csrf().disable().cors().disable()
                .formLogin().failureUrl("/auth/connection_echoue").successForwardUrl("/auth/connection_reussite").loginPage("/auth/login").permitAll()
                .and()
                .logout().logoutRequestMatcher(new AntPathRequestMatcher("/auth/logout")).logoutSuccessUrl("/auth/logout_success/").deleteCookies("remember-me").permitAll()
                .and()
                .rememberMe();
    }

}

