//package com.findr.configuration;
//
//import java.util.List;
//import java.util.Properties;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//
//
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(securedEnabled=true)
//public class Security extends WebSecurityConfigurerAdapter {
//
//    //Ce service nous permet d'obtenir les username et mots de passe de tout les utilisateurs de notre BD.
//    @Autowired
//    private UserAuthService authService;
//
//    //Simple configuration qui va faire la reconnaissances de tout les utilisateur de la BD par l'intermédioaire du service
//    @Autowired
//    public void globaConfig(AuthenticationManagerBuilder auth) throws Exception{
//        auth.userDetailsService(this.authService).passwordEncoder(User.PASSWORD_ENCODER);
//    }
//
//    //Apres avoir defini les diférents users, il faut aussi leur configurer les ressources dont ils ont accées.
//    @Override
//    protected void configure(HttpSecurity http) throws Exception{
//
//        //Cette anotation est le design pattern builder
//        http
//
//                // on authaurise les accée sur les ressources css , js et images qui est authentifier
//                .authorizeRequests()
//                .antMatchers("/css/**","*/js**","*/images/**").permitAll()
//                .anyRequest()
//                .authenticated()
//                .and()
//                // La seule ressources qui sera disponible pour les nons-authentifiés, c'est la "/" (page login index.html)
//                .formLogin()
//                .loginPage("/")
//                .permitAll()
//                // l'url si l'authentification réussie.
//                .defaultSuccessUrl("/connection_reussite")
//                // l'url si l'authentification échoue.
//                .failureUrl("/connection_echoue");
//    }
//
//}
