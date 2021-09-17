# todo-springboot
Todo application using spring boot

Spring Boot Application Initializer
The first step in producing a deployable war file is to provide a SpringBootServletInitializer subclass and override its configure() method.
This makes use of Spring Framework’s Servlet 3.0 support and allows you to configure your application when it’s launched by the servlet container.


The SpringApplication class provides a convenient way to bootstrap a Spring application that is started from a main() method. 
In many situations, you can delegate to the static SpringApplication.run method, as shown in the following example:
public static void main(String[] args) {
	SpringApplication.run(MySpringConfiguration.class, args);
}

A SpringApplication attempts to create the right type of ApplicationContext on your behalf. The algorithm used to determine a WebApplicationType is fairly simple:
--> If Spring MVC is present, an AnnotationConfigServletWebServerApplicationContext is used



