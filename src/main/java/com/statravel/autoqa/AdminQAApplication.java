package com.statravel.autoqa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 
 * @author STA Development Team
 *
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
public class AdminQAApplication {

    /**
     * Starts the application.
     * 
     * @param args
     *            arguments
     */
    public static void main(final String[] args) {
        SpringApplication.run(AdminQAApplication.class, args);

    }

}
