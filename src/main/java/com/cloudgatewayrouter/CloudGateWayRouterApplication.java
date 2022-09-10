package com.cloudgatewayrouter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//(exclude = {WebMvcAutoConfiguration.class})
@EnableEurekaClient
public class CloudGateWayRouterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudGateWayRouterApplication.class, args);
	}

}
