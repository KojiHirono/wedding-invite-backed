package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // すべてのAPIに適用
//                        .allowedOrigins("http://localhost:3000") // Next.js のURLを許可
                        .allowedOrigins("https://wedding-invite-app-pi.vercel.app") // フロントのURL
                        .allowedMethods("GET", "POST", "PUT", "DELETE") // 許可するHTTPメソッド
                        .allowCredentials(true);
            }
        };
    }
}
