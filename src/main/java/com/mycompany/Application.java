package com.mycompany;


import com.mycompany.controllers.HealthCheckService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *

 The Spring Framework was first released in 2004;

 Since then there have been significant major revisions:

  - Spring 2.0 provided XML namespaces and AspectJ support;
  - Spring 2.5 embraced annotation-driven configuration;
  - Spring 3.0 introduced a strong Java 5+ foundation across the framework codebase,
      and features such as the Java-based @Configuration model.

  - Spring 4.0 is the latest major release of the Spring Framework and the first to fully support Java 8 features.


 */

public class Application {


  public static void main(String[] args) {

    ApplicationContext context =
            new ClassPathXmlApplicationContext(new String[] {"application-context.xml"});


    HealthCheckService petStoreService = context.getBean("petStore", HealthCheckService.class);


    System.out.println("Get Service HealthCheck: "+ petStoreService.healthCheck());



  }

}
