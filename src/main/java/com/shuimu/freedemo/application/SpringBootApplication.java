package com.shuimu.freedemo.application;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2016/5/23.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan("com")
public class SpringBootApplication extends SpringBootServletInitializer{
}
