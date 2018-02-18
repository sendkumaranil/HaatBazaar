package com.hatbazar.onlineshopping.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages="com.hatbazar.onlineshopping")
public class HatbazarConfigContext {
	
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver vwresolver=new InternalResourceViewResolver();
		vwresolver.setViewClass(JstlView.class);
		vwresolver.setPrefix("/WEB-INF/views/");
		vwresolver.setSuffix(".jsp");
		return vwresolver;
	}
}
