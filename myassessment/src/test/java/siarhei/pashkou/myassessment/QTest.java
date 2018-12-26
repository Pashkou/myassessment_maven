package siarhei.pashkou.myassessment;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class QTest {

    final Q q = new Q();

    final List<LocalDate> input = Arrays.asList(
            LocalDate.of(1980, Month.FEBRUARY, 18),//MONDAY
            LocalDate.of(2000, Month.JANUARY, 5),  //WEDNESDAY
            LocalDate.of(2017, Month.MAY, 11),     //THURSDAY
            LocalDate.of(2017, Month.JANUARY, 3),  //TUESDAY
            LocalDate.of(2017, Month.FEBRUARY, 1), //WEDNESDAY
            LocalDate.of(2010, Month.DECEMBER, 23),//THURSDAY
            LocalDate.of(2010, Month.FEBRUARY, 1), //MONDAY
            LocalDate.of(2017, Month.JANUARY, 28), //SATURDAY
            LocalDate.of(2017, Month.JANUARY, 29)  //SUNDAY
    );

    @Test
    public void countByMonth() {
        final Map<Month, Long> expected = new HashMap<>();
        expected.put(Month.FEBRUARY, 3L);
        expected.put(Month.JANUARY, 2L);
        expected.put(Month.DECEMBER, 1L);
        expected.put(Month.MAY, 1L);

        assertEquals(expected,q.countByMonth(input));
    }
}