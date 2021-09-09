package com.example.flywaytest;

import org.springframework.jdbc.core.JdbcTemplate;
import org.flywaydb.test.annotation.FlywayTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.equalTo;

@SpringBootTest
class FlywaytestApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private JdbcTemplate template;

	@FlywayTest(invokeCleanDB = true)
	@Test
	public void singleLocation() throws Exception {
		assertThat(template.queryForObject(
				"SELECT COUNT(*) from student", Integer.class),
				equalTo(2));
	}
}
