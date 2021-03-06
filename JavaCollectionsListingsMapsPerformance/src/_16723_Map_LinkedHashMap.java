import java.util.LinkedHashMap;
import java.util.Map;

public class _16723_Map_LinkedHashMap {
	public static void main(String[] args) {

		long start_time1 = System.currentTimeMillis();

		Map<Integer, String> myRecord = new LinkedHashMap<Integer, String>();

		for (int i = 0; i < 10000000; i++) {
			myRecord.put(i, "" + i);
		}

		for (Map.Entry m : myRecord.entrySet()) {
			// System.out.println(m.getKey() + " " + m.getValue());
		}

		long end_time1 = System.currentTimeMillis();
		System.out.println(end_time1 - start_time1);
	}
}
