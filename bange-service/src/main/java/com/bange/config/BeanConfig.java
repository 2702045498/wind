package com.bange.config;

import com.bange.service.PersonService;
import org.springframework.boot.web.server.WebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration 指定该组件为配置类
 */
@Configuration
public class BeanConfig {
    /**
     *  @Bean组件返回值，id默认为方法名,也可以是用value指定ID
     * @return
     */
    @Bean(value ={ "personService","personService2"})
    public PersonService personService02(){
        return new PersonService();
    }



}
