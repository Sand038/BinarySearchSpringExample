package com.example.springexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringExampleApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringExampleApplication.class, args);
        BinarySearch binarySearch = applicationContext.getBean(BinarySearch.class);

        boolean result = binarySearch.binarySearch(new int[]{12, 4, 5}, 4);
        if (result)
            System.out.println("Element is present");
        else
            System.out.println("Element is not present");
    }

}
