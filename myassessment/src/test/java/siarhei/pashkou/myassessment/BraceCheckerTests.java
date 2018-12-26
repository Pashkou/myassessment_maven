package siarhei.pashkou.myassessment;

import static org.junit.Assert.*;
import org.junit.Test;

public class BraceCheckerTests {

  private BraceChecker checker = new BraceChecker();

	@Test
	public void testValid() {
		assertEquals(true, checker.isValid("(dfe)"));
	}
  
    @Test
	public void testInvalid() {
    	assertEquals(false, checker.isValid("[(])"));
	}

}