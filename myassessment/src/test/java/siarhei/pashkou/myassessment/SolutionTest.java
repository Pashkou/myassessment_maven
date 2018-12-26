package siarhei.pashkou.myassessment;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void testBasics() {
      assertEquals(23, new Solution().solution(10));
      assertEquals(0, new Solution().solution(0));
      assertEquals(9168, new Solution().solution(200));
    }
}
