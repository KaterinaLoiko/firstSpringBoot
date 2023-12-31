package ru.netology.firstspringboot.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.firstspringboot.DevProfile;
import ru.netology.firstspringboot.ProductionProfile;
import ru.netology.firstspringboot.SystemProfile;

@Configuration
public class JavaConfig {

    @Bean
    @ConditionalOnProperty(prefix = "netology", name = "profile.dev", havingValue="true")
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(prefix = "netology", name = "profile.dev", havingValue="false")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
