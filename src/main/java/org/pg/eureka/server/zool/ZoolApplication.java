package org.pg.eureka.server.zool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZoolApplication.class, args);
	}

}
