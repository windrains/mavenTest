package com.explore.springboot.init.config;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class MybatisConfig {
    /**
     * 设置表的下划线与bean的大写字母对应
     * 此设置对写在xml的sql不起作用，
     * 需在mybatis-config.xml中配置此属性标签<setting name="mapUnderscoreToCamelCase" value="true"></setting>
     * <setting>中配置mapUnderscoreToCamelCase适用所有方式，即不需要此类了。
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
