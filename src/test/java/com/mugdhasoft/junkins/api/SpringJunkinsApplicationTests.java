package com.mugdhasoft.junkins.api;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
class SpringJunkinsApplicationTests {
public static Logger logger=LoggerFactory.getLogger(SpringJunkinsApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Test case executing....");
		logger.info("Test case executing. second log statement...");
		logger.info("Test case executing. Third log statement for email configuration...");
		logger.info("Test case executing. 4th log statement for email configuration...");
		logger.info("Test case executing. 5th log statement for email configuration...");
		
		 assertEquals(true, true);
	}

}
