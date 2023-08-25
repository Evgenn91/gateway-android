package com.github.Evgenn91.port.rest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan("com.github.Evgenn91.port.rest")
public class GatewayPortRestConfiguration implements WebMvcConfigurer {
}
