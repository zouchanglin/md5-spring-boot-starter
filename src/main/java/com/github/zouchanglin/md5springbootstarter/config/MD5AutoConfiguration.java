package com.github.zouchanglin.md5springbootstarter.config;

import com.github.zouchanglin.md5springbootstarter.service.MD5Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MD5AutoConfiguration {
    @Bean
    MD5Service md5Service() {
        return new MD5Service();
    }
}
