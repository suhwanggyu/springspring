package com.example.assignment2_su;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DaoFactory.class})
public class ApplicationConfig {
}

