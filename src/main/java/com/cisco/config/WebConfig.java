package com.cisco.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by tvajjala on 8/2/17.
 */
@EnableWebMvc
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter{
    
    @Override
    public void addViewControllers( ViewControllerRegistry registry) {
        super.addViewControllers( registry );
        registry.addRedirectViewController( "/", "/index.html" );
        registry.addViewController( "/index.html" ).setViewName( "index" );
        
    }
    
    
    @Override
    public void addResourceHandlers( ResourceHandlerRegistry registry) {
        super.addResourceHandlers( registry );
        registry.addResourceHandler( "/favicon.ico" ).addResourceLocations( "classpath:/static/" );
        registry.addResourceHandler( "/jnlp/**" ).addResourceLocations( "classpath:/static/" );
    }
    
}
