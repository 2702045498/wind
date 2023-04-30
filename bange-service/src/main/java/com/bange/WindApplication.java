package com.bange;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class WindApplication {
    /**
     * 定制化SpringApplication
     * @param args
     */
    public static void main(String[] args) {
        new SpringApplicationBuilder(WindApplication.class)
//                .bannerMode(Banner.Mode.OFF)
                .run(args);
//        SpringApplication application = new SpringApplication(WindApplication.class);
//           //关闭banner
//        application.setBannerMode(Banner.Mode.OFF);
//        application.run(args);
    }
}
