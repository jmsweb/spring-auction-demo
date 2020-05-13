# spring-boot
Spring Web MVC Boot-Based Configuration

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

What things you need to install the software and how to install them

1. Java 11
2. NPM 6+
3. Angular CLI 9+
4. Node 12+
5. Maven 3.6+
6. Git 2.23
7. Eclipse 2020-03, or IDE with Maven and Java support

## Clone Source Code

Clone the repository onto local
```
git clone git@github.com:jmsweb/spring-auction-demo.git spring-auction-demo
```
## Start Backend Server (Spring-Boot/Java Framework)
Navigate to `spring-auction-demo/test-cms`
```
cd spring-auction-demo/test-cms
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
[INFO] skip non existing resourceDirectory /Users/dorado/workspace/eclipse-jee/spring-auction-demo/test-cms/test-web/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.0:testCompile (default-testCompile) @ test-web ---
[INFO] No sources to compile
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

2020-05-11 14:53:25.228  INFO 3708 --- [           main] c.j.configuration.WebBootConfiguration   : Starting WebBootConfiguration on dorado-mac.local with PID 3708 (/Users/dorado/workspace/eclipse-jee/spring-auction-demo/test-cms/test-web/target/classes started by dorado in /Users/dorado/workspace/eclipse-jee/spring-auction-demo/test-cms/test-web)
2020-05-11 14:53:25.233  INFO 3708 --- [           main] c.j.configuration.WebBootConfiguration   : No active profile set, falling back to default profiles: default
2020-05-11 14:53:25.968  INFO 3708 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2020-05-11 14:53:25.977  INFO 3708 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2020-05-11 14:53:25.977  INFO 3708 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.34]
2020-05-11 14:53:26.195  INFO 3708 --- [           main] org.apache.jasper.servlet.TldScanner     : At least one JAR was scanned for TLDs yet contained no TLDs. Enable debug logging for this logger for a complete list of JARs that were scanned but no TLDs were found in them. Skipping unneeded JARs during scanning can improve startup time and JSP compilation time.
2020-05-11 14:53:26.207  INFO 3708 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2020-05-11 14:53:26.207 DEBUG 3708 --- [           main] o.s.web.context.ContextLoader            : Published root WebApplicationContext as ServletContext attribute with name [org.springframework.web.context.WebApplicationContext.ROOT]
2020-05-11 14:53:26.207  INFO 3708 --- [           main] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 932 ms
2020-05-11 14:53:26.221 DEBUG 3708 --- [           main] o.s.b.w.s.ServletContextInitializerBeans : Mapping filters: characterEncodingFilter urls=[/*] order=-2147483648, formContentFilter urls=[/*] order=-9900, requestContextFilter urls=[/*] order=-105
2020-05-11 14:53:26.221 DEBUG 3708 --- [           main] o.s.b.w.s.ServletContextInitializerBeans : Mapping servlets: dispatcherServlet urls=[/]
2020-05-11 14:53:26.352  INFO 3708 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2020-05-11 14:53:26.360 DEBUG 3708 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : ControllerAdvice beans: 0 @ModelAttribute, 0 @InitBinder, 1 RequestBodyAdvice, 1 ResponseBodyAdvice
2020-05-11 14:53:26.401 DEBUG 3708 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : 3 mappings in 'requestMappingHandlerMapping'
2020-05-11 14:53:26.424 DEBUG 3708 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Patterns [/webjars/**, /**] in 'resourceHandlerMapping'
2020-05-11 14:53:26.432 DEBUG 3708 --- [           main] .m.m.a.ExceptionHandlerExceptionResolver : ControllerAdvice beans: 0 @ExceptionHandler, 1 ResponseBodyAdvice
2020-05-11 14:53:26.516  INFO 3708 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2020-05-11 14:53:26.520  INFO 3708 --- [           main] c.j.configuration.WebBootConfiguration   : Started WebBootConfiguration in 1.909 seconds (JVM running for 2.352)
```

Verify Tomcat is listening

```
curl http://localhost:8080
```

Alternatively, open web browser and enter `http://localhost:8080/` in the URL to see Whitelabel Error Page

## Start Frontend Server
Navigate to `spring-auction-demo/test-cms/test-web/src/main/client`

```
cd spring-auction-demo/test-cms/test-web/src/main/client
```

Compile frontend source

```
ng serve --open
```

Open Web Browser

```
http://localhost:4200/
```

## Running the tests

I did not add test suite nor cases in this demo. In future, I would write Java and Angular assertion tests to filter out the edge cases.

## Deployment

The built WAR is located in target folder, depending on deployment method it can be drag and drop or invoked after CI/CD pipeline.

```
test-cms/test-web/target/test-web.war
```

## Built With

* [Eclipse](https://www.eclipse.org/downloads/) - The IDE used
* [Maven](https://maven.apache.org/) - Dependency Management
* [Spring IO](https://spring.io/) - Spring Framework
* [Java 11](https://www.oracle.com/java/technologies/javase-downloads.html) - Java Development Kit
* [Spring Initialzer](https://start.spring.io) - Quickstart Spring Boot
* [Angular CLI](https://cli.angular.io) - Angular Framework an CLI Executable
* [npm](https://www.npmjs.com/get-npm) - Node Package Manager
* [Mac Catalina 10.15.4](https://www.apple.com/macos/catalina/) MacOS Environment

## Versioning

I use [Git](http://github.com/) for versioning. For the versions available, see the [tags on this repository](https://github.com/jmsweb/spring-auction-demo/tags). 

## Authors

* **Jason Schwebke** - *Initial work* - [jmsweb](https://github.com/jmsweb)
* [jmsweb GitHub Pages](jmsweb.github.io)

See also the list of [contributors](https://github.com/jmsweb/spring-boot/contributors) who participated in this project.

## License

This project is licensed under the Apache 2.0 License - see the [LICENSE](LICENSE) file for details

## Acknowledgments

* Hat tip to [Baeldung](https://www.baeldung.com) whose guides were helpful.
* [Angular Documentation](https://angular.io/docs) for getting it to work.
