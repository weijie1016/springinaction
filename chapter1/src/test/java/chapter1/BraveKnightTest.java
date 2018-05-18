package chapter1;

import org.testng.annotations.Test;

import chapter1.config.KnightConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

import org.springframework.util.StringUtils;

@ContextConfiguration(classes=KnightConfig.class)
public class BraveKnightTest extends AbstractTestNGSpringContextTests{
	@Autowired
	private Knight knight;
	@Test
	public void f() {
		knight.embarkOnQuest();
	}
}
