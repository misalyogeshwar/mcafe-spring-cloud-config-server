package com.mcafe.mcafespringcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class McafeSpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(McafeSpringCloudConfigServerApplication.class, args);
	}

}
