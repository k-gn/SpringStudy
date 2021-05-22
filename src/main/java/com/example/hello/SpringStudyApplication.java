package com.example.hello;

import com.example.hello.ioc.Base64Encoder;
import com.example.hello.ioc.Encoder;
import com.example.hello.ioc.UrlEncoder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Base64;

@SpringBootApplication
public class SpringStudyApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringStudyApplication.class, args);
        System.out.println(Base64.getEncoder().encodeToString("hhh@hhh.com".getBytes()));

        /*
        ApplicationContext context = ApplicationContextProvider.getContext();

        String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";

        Encoder encoder = context.getBean("base64Encode", Encoder.class);
        String result = encoder.encode(url);
        System.out.println(result);
         */
    }

}


// 한 클래스 안에 여러 빈을 등록할 수 있다.
@Configuration
class AppConfig {

    @Bean("base64Encode")
    public Encoder encoder(Base64Encoder base64Encoder) {
        return new Encoder(base64Encoder);
    }

    @Bean("urlEncode")
    public Encoder encoder(UrlEncoder urlEncoder) {
        return new Encoder(urlEncoder);
    }
}