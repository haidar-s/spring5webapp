package de.cognizant.bookingtool;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BookingtoolwebappApplication {

	private static final Logger log = LoggerFactory.getLogger(BookingtoolwebappApplication.class);

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(BookingtoolwebappApplication.class, args);
		Object datasource = context.getBean("dataSource");
	}
}
