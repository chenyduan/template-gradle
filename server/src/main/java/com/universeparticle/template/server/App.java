package com.universeparticle.template.server;

import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);

        System.out.println("use common-lang3 defined in common-lib");
        System.out.println(StringUtils.isBlank("test"));
    }
}
