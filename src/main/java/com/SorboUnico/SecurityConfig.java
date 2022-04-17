package com.SorboUnico;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("userP@gmail.com")
                .password("{noop}12345")
                .roles("USERPREMIUN", "USER")
                .and()
                .withUser("user@gmail.com")
                .password("{noop}abcdef")
                .roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/Menu","/Perfil","/Nosotros","/Contacto","/Reserva") //TODOS
                .hasRole("USERPREMIUN")
                
                .antMatchers("/Menu","/Perfil","/Nosotros","/Contacto") //PONER TODOS MENOS RESERVAS
                .hasAnyRole("USERPREMIUN", "USER")
                
                .antMatchers("/")
                .hasAnyRole("USERPREMIUN", "USER")
                
                .and()
                .formLogin()
                .loginPage("/Login")
                .and()
                .exceptionHandling().accessDeniedPage("/errores/403");
    }

}
