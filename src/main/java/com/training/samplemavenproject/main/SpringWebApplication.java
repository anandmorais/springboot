package com.training.samplemavenproject.main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringWebApplication {

		protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
			return application.sources(SpringWebApplication.class);
		}

		public static void main(String[] args) throws Exception {
			SpringApplication.run(SpringWebApplication.class, args);
		}


}
