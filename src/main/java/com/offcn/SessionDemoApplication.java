package com.offcn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SessionDemoApplication {

    //自动配置 是根据你加载的依赖  在内存中有没有这些类  然后就会生效
    //templates 只能放模板
    public static void main(String[] args) {
        SpringApplication.run(SessionDemoApplication.class, args);
    }

}
