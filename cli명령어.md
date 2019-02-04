
### spring boot maven plugin 명령어

- spring-boot-maven-plugin  
- version 2.1.2.RELEASE  


### help 명령어  
`> mvn spring-boot:help`  

### run 명령  
`> mvn spring-boot:run`  
`> mvn package -DskipTests=true`  
`> java -jar target/spring-boot-config-0.0.1-SNAPSHOT.jar --spring.config.name=mycfg`  

 



### argument 추가 명령어  
`> mvn spring-boot:run -Dspring-boot.run.arguments="arg1,arg2"`  

### spring init 프로젝트 만들기

`> spring init -g=com.apress.spring -a=spring-boot-config --package=com.apress.spring -name=spring-boot-config -x`

 - `-g` groupId  
 - `-a` artifactId  
 - `--package` package  
 - `-x` 현재폴더  


### spring 환경설정 파일 지정 application.properties -> mycfg.properties  
` > mvnw spring-boot:run -Dspring.config.name=mycfg`  

### spring profile

- application-qa.properties  
  `server.ip=localhost`  
- application-prod.properties  
  `server.ip=http://my-remote.server.com`  
  
`> mvn clean spring-boot:run -Dspring.profiles.active=prod`

  
  
