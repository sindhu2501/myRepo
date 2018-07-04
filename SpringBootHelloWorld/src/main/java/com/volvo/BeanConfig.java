package com.volvo;

import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class BeanConfig {

    @Autowired
    private EntityManagerFactory emf;

    @Bean
    public SessionFactory getSessionFactory() {
        if (emf.unwrap(SessionFactory.class) == null) {
            throw new NullPointerException("Unable to get session factory");
        }
        return emf.unwrap(SessionFactory.class);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                // registry.addMapping("/**").allowedMethods("HEAD", "OPTIONS").allowedHeaders("Origin", "X-Requested-With", "Content-Type", "Accept");
                registry.addMapping("/**")
                        .allowedOrigins("/*")
                        .allowedMethods("*")
                        // .allowedHeaders("Content-Type", "X-Requested-With", "accept", "Origin", "Access-Control-Request-Method",
                        // "Access-Control-Request-Headers")
                        .exposedHeaders("Access-Control-Allow-Origin", "Access-Control-Allow-Credentials", "Access-Control-Allow-Credentials",
                                        "Access-Control-Allow-Methods").allowCredentials(true).maxAge(3600);
            }
        };
    }

}
