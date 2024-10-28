package dev.spectrProfil;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") //разрешенные апи
                .allowedOrigins("http://localhost:5173") // адрес фронта
                .allowedMethods("POST"); //разрешенные методы
    }
}
