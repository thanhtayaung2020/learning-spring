package com.formatter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.model.Formatter;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { com.test.config.AppConfig.class })
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FormatterTest {

	private final static Logger LOG = LogManager.getLogger(FormatterTest.class);

	@Autowired(required = false)
	@Qualifier("fooFormatter")
	private Formatter formatter;

	@Test
	public void test_create() {

		System.out.println(formatter.format());

	}

}
