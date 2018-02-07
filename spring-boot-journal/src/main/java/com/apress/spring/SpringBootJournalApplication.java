package com.apress.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jms.activemq.ActiveMQAutoConfiguration;
import org.springframework.context.annotation.Bean;

import com.apress.spring.domain.Journal;
import com.apress.spring.repository.JournalRepository;

@SpringBootApplication(exclude= {ActiveMQAutoConfiguration.class,
		DataSourceAutoConfiguration.class})
public class SpringBootJournalApplication {
	
//	private static Logger log = LoggerFactory.getLogger(SpringBootJournalApplication.class);
	/* InitializingBean
	 * 스프링 엔진이 인스턴스 생성 후 초기화 할 때 항상 호출하는 특수 클래스
	*/
//	@Bean
//	InitializingBean saveData(JournalRepository repo) {
//		return () -> {
//			repo.save(new Journal("스프링 부트 입문", "오늘부터 스프링 부트 공부하기 시작했다", "01/01/2016"));
//			repo.save(new Journal("간단한 스프링 부트 프로젝트", "스프링 부트 프로젝트를 처음 만들어 보았다.", "01/02/2016"));
//			repo.save(new Journal("스프링 부트 해부", "스프링 부트를 자세히 살펴보았다", "02/01/2016"));
//			repo.save(new Journal("스프링 부트 클라우드", "클라우드 파운드리를 응용한 스프링 부트를 공부했다", "03/01/2016"));
//		};
//	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJournalApplication.class, args);
	}
	
//	@Value("${server.ip}")
//	String serverIp;
//	
//	@Bean
//	CommandLineRunner values() {
//		return args -> {
//			log.info(" > 서버 IP: " + serverIp);
//		};
//	}
}
