package com.shivan;

//CollegeConfig class

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.shivan")
@PropertySource("classpath:college-info.properties")
public class CollegeConfig {

}
