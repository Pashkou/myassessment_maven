package siarhei.pashkou.myassessment;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q {

	public Map<Month, Long> countByMonth(List<LocalDate> dates) {
		Map<Month, Long> result = new HashMap<>();
		for (LocalDate localDate : dates) {
			if ((localDate.getDayOfWeek() != DayOfWeek.SATURDAY) && (localDate.getDayOfWeek() != DayOfWeek.SUNDAY)) {
				result = processSingleDate(result, localDate);
			}
		}
		return result;
	}

	private Map<Month, Long> processSingleDate(Map<Month, Long> result, LocalDate localDate) {
		if (result.containsKey(localDate.getMonth())) {
			Long occurrences = result.get(localDate.getMonth());
			result.put(localDate.getMonth(), ++occurrences);
		} else {
			result.put(localDate.getMonth(), 1L);
		}
		return result;
	}
}
