package com.quiz.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;


/**
 * @author siddharth pandey
 *
 */
@SpringBootApplication
public class QuizSystemApplication extends SpringBootServletInitializer{
	
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        SpringApplication.run(QuizSystemApplication.class, args);
    }
    
}
