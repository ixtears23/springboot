## spring boot cli

> 윈도우 cmd UTF-8  
> chcp 65001  
> 바로 위에줄 cmd창에서 입력 후 엔터  

부트실행  
* mvnw spring-boot:run
인자값 던지기  
* mvnw spring-boot:run -Drun.arguments="--enable"
* mvnw spring-boot:run -Drun.arguments="arg1,arg2"

실행 가능한 JAR 파일 생성  
* mvnw package
java로 실행  
* java -jar target/spring-boot-simple-0.0.1-SNAPSHOT.jar
인자 전달  
* java -jar target/spring-boot-simple-0.0.1-SNAPSHOT.jar --enable arg1 arg2



