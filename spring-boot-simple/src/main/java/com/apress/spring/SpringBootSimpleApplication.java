package com.apress.spring;

import java.io.PrintStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class SpringBootSimpleApplication {

	public static void main(String[] args) {
		/**
		 * Task 1. SpringApplication
		 */
		//SpringApplication app = new SpringApplication(SpringBootSimpleApplication.class);
		// http://patorjk.com/
		/* [Banner]
		app.setBanner(new Banner() {
			@Override
			public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
				out.print("\n\n\t나만의 멋진 배너랍니다!\n\n".toUpperCase());
				
			}
		});
		app.setBannerMode(Mode.OFF);
		
		//springboot Cli
		// mvnw spirng-boot:run
		// mvnw spring-boot:run -Dbanner.location=classpath:/META-INF/banner.txt

		app.run(args);
		 */
//		SpringApplication.run(SpringBootSimpleApplication.class, args);
		
		/**
		 * Task 2. SpringApplicationBuilder
		 */
		
		Logger log = LoggerFactory.getLogger(SpringBootSimpleApplication.class);
		
		new SpringApplicationBuilder()
			.bannerMode(Banner.Mode.OFF)
			.sources(SpringBootSimpleApplication.class)
//			.logStartupInfo(false)
			.listeners(new ApplicationListener<ApplicationEvent>() {

				@Override
				public void onApplicationEvent(ApplicationEvent event) {
					log.info("#### > " + event.getClass().getCanonicalName());
				}
			})
			.run(args);
		
	}
}
