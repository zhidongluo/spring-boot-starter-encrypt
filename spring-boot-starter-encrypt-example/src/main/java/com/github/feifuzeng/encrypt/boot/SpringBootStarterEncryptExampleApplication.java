package com.github.feifuzeng.encrypt.boot;

import com.github.feifuzeng.encrypt.boot.anno.EnableEncrypt;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncrypt
public class SpringBootStarterEncryptExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStarterEncryptExampleApplication.class, args);
    }

}
