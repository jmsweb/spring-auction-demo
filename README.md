# spring-boot
Spring Web MVC Boot-Based Configuration

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

What things you need to install the software and how to install them

1. Java 11
2. Maven
3. Git
4. Eclipse, or IDE with Maven and Java support

### Installing

Clone the repository onto local
```
git clone git@github.com:jmsweb/spring-boot.git spring-boot
```

Navigate to `spring-boot/test-cms`
```
cd spring-boot/test-cms
```

Run maven build
```
mvn clean install
```

Run Spring Boot command
```
mvn -pl test-web spring-boot:run
```

Terminal Output
```
dorado@dorado-mac test-cms % mvn -pl test-web spring-boot:run
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------------< com.jmsweb:test-web >-------------------------
[INFO] Building A module project (WAR) 1.0.0-SNAPSHOT
[INFO] --------------------------------[ war ]---------------------------------
[INFO] 
[INFO] >>> spring-boot-maven-plugin:2.2.7.RELEASE:run (default-cli) > test-compile @ test-web >>>
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ test-web ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 2 resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.0:compile (default-compile) @ test-web ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ test-web ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/dorado/workspace/eclipse-jee/spring-boot/test-cms/test-web/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.0:testCompile (default-testCompile) @ test-web ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] <<< spring-boot-maven-plugin:2.2.7.RELEASE:run (default-cli) < test-compile @ test-web <<<
[INFO] 
[INFO] 
[INFO] --- spring-boot-maven-plugin:2.2.7.RELEASE:run (default-cli) @ test-web ---
[INFO] Attaching agents: []

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.2.7.RELEASE)

2020-05-10 02:41:24.813  INFO 6017 --- [           main] c.j.configuration.WebBootConfiguration   : Starting WebBootConfiguration on dorado-mac.local with PID 6017 (/Users/dorado/workspace/eclipse-jee/spring-boot/test-cms/test-web/target/classes started by dorado in /Users/dorado/workspace/eclipse-jee/spring-boot/test-cms/test-web)
2020-05-10 02:41:24.815  INFO 6017 --- [           main] c.j.configuration.WebBootConfiguration   : No active profile set, falling back to default profiles: default
2020-05-10 02:41:25.629  INFO 6017 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2020-05-10 02:41:25.640  INFO 6017 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2020-05-10 02:41:25.640  INFO 6017 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.34]
2020-05-10 02:41:25.885  INFO 6017 --- [           main] org.apache.jasper.servlet.TldScanner     : At least one JAR was scanned for TLDs yet contained no TLDs. Enable debug logging for this logger for a complete list of JARs that were scanned but no TLDs were found in them. Skipping unneeded JARs during scanning can improve startup time and JSP compilation time.
2020-05-10 02:41:25.899  INFO 6017 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2020-05-10 02:41:25.899 DEBUG 6017 --- [           main] o.s.web.context.ContextLoader            : Published root WebApplicationContext as ServletContext attribute with name [org.springframework.web.context.WebApplicationContext.ROOT]
2020-05-10 02:41:25.899  INFO 6017 --- [           main] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 1035 ms
2020-05-10 02:41:25.914 DEBUG 6017 --- [           main] o.s.b.w.s.ServletContextInitializerBeans : Mapping filters: characterEncodingFilter urls=[/*] order=-2147483648, formContentFilter urls=[/*] order=-9900, requestContextFilter urls=[/*] order=-105
2020-05-10 02:41:25.914 DEBUG 6017 --- [           main] o.s.b.w.s.ServletContextInitializerBeans : Mapping servlets: dispatcherServlet urls=[/]
2020-05-10 02:41:26.113  INFO 6017 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2020-05-10 02:41:26.124 DEBUG 6017 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : ControllerAdvice beans: 0 @ModelAttribute, 0 @InitBinder, 1 RequestBodyAdvice, 1 ResponseBodyAdvice
2020-05-10 02:41:26.181 DEBUG 6017 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : 3 mappings in 'requestMappingHandlerMapping'
2020-05-10 02:41:26.207 DEBUG 6017 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Patterns [/webjars/**, /**] in 'resourceHandlerMapping'
2020-05-10 02:41:26.218 DEBUG 6017 --- [           main] .m.m.a.ExceptionHandlerExceptionResolver : ControllerAdvice beans: 0 @ExceptionHandler, 1 ResponseBodyAdvice
2020-05-10 02:41:26.318  INFO 6017 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2020-05-10 02:41:26.324  INFO 6017 --- [           main] c.j.configuration.WebBootConfiguration   : Started WebBootConfiguration in 2.155 seconds (JVM running for 2.599)
```

Verify request works

```
curl http://localhost:8080
```

Alternatively, open web browser and enter `http://localhost:8080/` in the URL

## Running the tests

To be added later.

### Break down into end to end tests

To be added later.

### And coding style tests

To be added later.

## Deployment

The built WAR is located in target folder, depending on deployment method it can be drag and drop or invoked after CI/CD pipeline.

```
test-cms/test-web/target/test-web.war
```

## Built With

* [Eclipse](https://www.eclipse.org/downloads/) - The IDE used
* [Maven](https://maven.apache.org/) - Dependency Management
* [Spring IO](https://spring.io/) - Spring Framework
* [Java 11](https://www.oracle.com/java/technologies/javase-downloads.html)
* [Spring Initialzer](https://start.spring.io) - Quickstart Spring Boot

## Contributing

To be added later.

## Versioning

I use [Git](http://github.com/) for versioning. For the versions available, see the [tags on this repository](https://github.com/jmsweb/spring-boot/tags). 

## Authors

* **Jason Schwebke** - *Initial work* - [jmsweb](https://github.com/jmsweb)
* [jmsweb GitHub Pages](jmsweb.github.io)

See also the list of [contributors](https://github.com/jmsweb/spring-boot/contributors) who participated in this project.

## License

This project is licensed under the Apache 2.0 License - see the [LICENSE](LICENSE) file for details

## Acknowledgments

* Hat tip to [Baeldung](https://www.baeldung.com) whose guides were helpful
