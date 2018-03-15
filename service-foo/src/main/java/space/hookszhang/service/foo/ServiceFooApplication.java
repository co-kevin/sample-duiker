package space.hookszhang.service.foo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServiceFooApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceFooApplication.class, args);
    }
}
