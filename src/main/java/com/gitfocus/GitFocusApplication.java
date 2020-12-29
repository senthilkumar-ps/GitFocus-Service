package com.gitfocus;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tech Mahindra 
 * Initial class to boot GitFocus Application
 */
@SpringBootApplication
@EnableScheduling
public class GitFocusApplication {

	private static final Logger logger = LogManager.getLogger(GitFocusApplication.class.getSimpleName());

	public GitFocusApplication() {
		super();
		// TODO Auto-generated constructor stub
		logger.info("Starting GitFocus-Service Application..");
	}

	@Autowired
	private Environment env;

	@RestController
	class HelloworldController {

		@GetMapping("/")
		public String helloSpringProfile() {

			return env.getProperty("app.message");
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(GitFocusApplication.class, args);
	}
}