package chapter2;

import static org.testng.Assert.assertNotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest extends AbstractTestNGSpringContextTests {
//	@Autowired
	private CompactDisc cd;
	@Autowired
	public void insertDisc(CompactDisc cd) {
		this.cd=cd;
	}
	@Test
	public void f() {
		assertNotNull(cd);
	}
}
