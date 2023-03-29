package com.univ;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.util.StringUtils;

/**
 * @author univ 2022/11/24 09:44
 */
@SpringBootApplication(scanBasePackages = {"com.univ"})
@Slf4j
public class DockerLearnApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext application = SpringApplication
				.run(DockerLearnApplication.class);
		Environment env = application.getEnvironment();
		String[] activeProfiles = env.getActiveProfiles();
		String port = env.getProperty("server.port");
		port = (StringUtils.isEmpty(port) ? "8080" : port);
		String path = env.getProperty("server.servlet.context-path");
		log.info("\n----------------------------------------------------------\n\t" +
				"Application DockerLearnApplicationStarter is running! Access URLs:\n\t" +
				"active profiles are :" + Arrays.toString(activeProfiles) + "\n\t" +
				"Local: \t\thttp://localhost:" + port + path + "/\n\t" +
				"----------------------------------------------------------");
	}
}
