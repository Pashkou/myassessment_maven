package siarhei.pashkou.myassessment;

import static org.junit.Assert.*;

import org.junit.Test;

// These example test cases are editable, feel free to add
// your own tests to debug your code.

public class SayHelloTests {
  
  @Test
  public void shouldSayHello() {
    assertEquals("Hello, Qualified!", Challenge.sayHello("Qualified"));
  }
  
}