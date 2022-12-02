import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Advent2 {

	public static void main (String[] args) throws Exception {
		Map<Integer,Integer> elves = new TreeMap<>();
		int e = 1;
		try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
			String l;
			while ((l = br.readLine()) != null) {
				l = l.trim();
				if (l.length() > 0) {
					int lv = Integer.parseInt(l);
					elves.compute(e, (k,v) -> (v != null ? v : 0) + lv);
				} else {
					e++;
				}
			}
		}
		List<Integer> values = elves.values().stream().sorted().toList();
		System.out.println(values.subList(values.size()-3, values.size()).stream().mapToInt(i2->i2).sum());
	}
	
}
