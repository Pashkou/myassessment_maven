package siarhei.pashkou.myassessment;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class PriceUpdaterTest {
       @Test
    public void example() {
        String[] items = {"Zinc","Copper"};
        BigDecimal[] prices = {new BigDecimal("5"),new BigDecimal("2.3")};

        HashMap<String, BigDecimal> expected = new HashMap<>();
        expected.put("Zinc", new BigDecimal("4.5"));
        expected.put("Coal", new BigDecimal("1.1"));
        assertEquals(expected, PriceUpdater.updatePrices(items, prices, "{Coal:1.1, Zinc:4.5, Copper:0}"));
    }
}