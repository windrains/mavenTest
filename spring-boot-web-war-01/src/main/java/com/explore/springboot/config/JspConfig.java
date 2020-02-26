package com.explore.springboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * 配置jsp视图解析器
 */
@Configuration
public class JspConfig {
    @Value("${spring.mvc.view.prefix}")
    private String prefix = "";

    @Value("${spring.mvc.view.suffix}")
    private String suffix = "";

    @Value("${spring.mvc.view.view-names}")
    private String viewNames = "";

    @Bean
    public InternalResourceViewResolver jspView(){
        InternalResourceViewResolver view = new InternalResourceViewResolver();
        view.setPrefix(prefix);
        view.setSuffix(suffix);
        view.setViewClass(JstlView.class);
        view.setViewNames(viewNames);
        return view;
    }
}
