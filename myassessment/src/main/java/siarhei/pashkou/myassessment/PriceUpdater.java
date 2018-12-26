package siarhei.pashkou.myassessment;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class PriceUpdater {

	public static Map<String, BigDecimal> updatePrices(String[] items, BigDecimal[] prices, String updates) {
		if ((items == null) || (prices == null) || (items.length != prices.length)) {
			// the case with invalid data should be handled and logged according to the project convention
			return null;
		}
		Map<String, BigDecimal> result = new HashMap<>();
		final List<String> priceUpdates = initData(items, prices, updates, result);
		return processData(result, priceUpdates);
	}

	private static Map<String, BigDecimal> processData(final Map<String, BigDecimal> result, final List<String> priceUpdates) {
		for (String price : priceUpdates) {
			int delimiter = price.indexOf(":");
			String itemName = price.substring(0, delimiter);
			BigDecimal newPrice = new BigDecimal(price.substring(delimiter + 1));

			if (result.containsKey(itemName) && newPrice.equals(BigDecimal.ZERO)) {
				result.remove(itemName);
			} else {
				result.put(itemName, newPrice);
			}
		}
		return result;
	}

	private static List<String> initData(String[] items, BigDecimal[] prices, String updates,
			final Map<String, BigDecimal> result) {
		for (int i = 0; i < items.length; i++) {
			result.put(items[i], prices[i]);
		}
		updates = updates.replaceAll("[{} ]", "");
		final List<String> priceUpdates = Collections.list(new StringTokenizer(updates, ",")).stream()
				.map(token -> (String) token).collect(Collectors.toList());
		return priceUpdates;
	}

}
