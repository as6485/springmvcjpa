package org.ayan.springmvcjpa.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


//@EnableJpaRepositories(basePackages="org.ayan.springmvcjpa.web.repo", entityManagerFactoryRef="emf")
@SpringBootApplication
@EnableJpaRepositories
public class MVCJPAApp {
   public static void main(String[] args) {
      SpringApplication.run(MVCJPAApp.class, args);
   }
}
