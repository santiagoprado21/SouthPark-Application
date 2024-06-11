package com.southpark.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.southpark.security.filters.JwtAuthenticationFilter;
import com.southpark.security.filters.JwtAuthorizationFilter;
import com.southpark.security.jwt.JwtUtils;
import com.southpark.service.UserDetailsServicesImpl;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled =  true)
public class SecurityConfig {

    @Autowired
    JwtUtils jwtUtils;
    
    @Autowired
    UserDetailsServicesImpl userDetailsServices;

    @Autowired
    JwtAuthorizationFilter authorizationFilter;

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity, AuthenticationManager authenticationManager) throws Exception{

        JwtAuthenticationFilter jwtAuthenticationFilter = new JwtAuthenticationFilter(jwtUtils);
        jwtAuthenticationFilter.setAuthenticationManager(authenticationManager);
<<<<<<< HEAD
=======
        
        
        jwtAuthenticationFilter.setFilterProcessesUrl("/login");
>>>>>>> 296cf62c13413836fa4444857f0b45019e106b18

        return httpSecurity
            .csrf(config -> config.disable())
            .authorizeHttpRequests(auth -> {
<<<<<<< HEAD
                auth.requestMatchers("/hello").permitAll();
=======
                auth.requestMatchers("/login").permitAll();
                auth.requestMatchers("/admin").hasRole("ADMIN");
                auth.requestMatchers("/users/{username}").permitAll();
                auth.requestMatchers("/booking/all").permitAll();
                auth.requestMatchers("/booking/addBooking").permitAll();
>>>>>>> 296cf62c13413836fa4444857f0b45019e106b18
                auth.anyRequest().authenticated();
            })
            .sessionManagement(session -> {
                session.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
            })
            .addFilter(jwtAuthenticationFilter)
            .addFilterBefore(authorizationFilter, UsernamePasswordAuthenticationFilter.class)
            .build();
    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    AuthenticationManager authenticationManager(HttpSecurity httpSecurity, PasswordEncoder passwordEncoder) throws Exception{
        return httpSecurity.getSharedObject(AuthenticationManagerBuilder.class)
            .userDetailsService(userDetailsServices)
            .passwordEncoder(passwordEncoder)
            .and().build();
    }

}
