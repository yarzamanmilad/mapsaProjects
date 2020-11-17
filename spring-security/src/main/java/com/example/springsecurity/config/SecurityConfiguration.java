package com.example.springsecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user")
                .password("{noop}12345678")
                .roles("USER");

    }
    @Override
    protected void configure(HttpSecurity auth) throws Exception {
       auth.authorizeRequests().antMatchers("/**").hasAnyRole("USER")
               .and()
                   .formLogin()

               .permitAll();

    }
}
