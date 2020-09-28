package com.personal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring()
        .antMatchers("/resources/**")
        .antMatchers("/css/**")
        .antMatchers("/js/**")
        .antMatchers("/img/**")
        ;
    }
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	
    	http.authorizeRequests()
        // 페이지 권한 설정
        .antMatchers("/admin/**").hasRole("ADMIN")
        .antMatchers("/mypage/**").hasRole("MEMBER")
        .antMatchers("/**").permitAll()
    .and() // 로그인 설정
        .formLogin()
        .loginPage("/login")
        .loginProcessingUrl("/login.action")
        .usernameParameter("id")
        .passwordParameter("pw")
        .successHandler(new LoginSuccessHandler())
        .permitAll()
    .and() // 로그아웃 설정
        .logout()
        .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
        .invalidateHttpSession(true)
    .and()
        .exceptionHandling().accessDeniedPage("/403");
    }
    
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
