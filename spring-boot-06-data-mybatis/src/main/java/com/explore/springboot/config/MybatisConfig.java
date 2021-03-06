package com.explore.springboot.config;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class MybatisConfig {
    /**
     * 设置表的下划线与bean的大写字母对应
     * 此设置对写在xml的sql不起作用，需在mybatis-config.xml中配置此属性标签<setting name="mapUnderscoreToCamelCase" value="true"></setting>
     */
    @Bean
    public ConfigurationCustomizer configurationCustomizer(){
        return new ConfigurationCustomizer(){

            @Override
            public void customize(Configuration configuration) {
                configuration.setMapUnderscoreToCamelCase(true);
            }
        };
    }
}
