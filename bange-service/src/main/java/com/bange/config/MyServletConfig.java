package com.bange.config;

import com.bange.filter.MyFilter;
import com.bange.listener.MyListener;
import com.bange.servlet.MyServlet;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.Arrays;

@Configuration
public class MyServletConfig {
    //servlet组件注册
    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        return new ServletRegistrationBean(new MyServlet(), "/myServlet");
    }
    //filter组件注册
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean filter = new FilterRegistrationBean();
        filter.setFilter(new MyFilter());
        filter.setUrlPatterns(Arrays.asList("/hello", "/myServlet"));
        return filter;
    }
    //listener组件注册
    @Bean
    public ServletListenerRegistrationBean servletListenerRegistrationBean(){
        ServletListenerRegistrationBean<MyListener> listener = new ServletListenerRegistrationBean<>(new MyListener());
       return listener;
    }

    /**
     * spring2.0使用WebServerFactoryCustomizer代替EmbeddedServletContainerCustomizer，
     * ConfigurableWebServerFactory配置类继承WebServerFactory
     * 即可配置嵌入式servlet容器的属性
     * @return
     */
    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer() {
        return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
            @Override
            public void customize(ConfigurableWebServerFactory factory) {
                factory.setPort(8081);
            }
        };
    }
}
