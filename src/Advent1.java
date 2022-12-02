import java.io.*;
import java.util.*;

public class Advent1 {

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
		System.out.println(elves.values().stream().mapToInt(i2 -> i2).max());
	}
	
}
