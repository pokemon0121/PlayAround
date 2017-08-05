import java.util.*;

public class Play {

	public static void main(String[] args) {
		listAsKeyInMap();
	}
	
	private static boolean noLetter(String s) {
        for (char c : s.toCharArray()) {
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }

	private static void listAsKeyInMap() {
		Map<List<Integer>, Integer> map = new HashMap<>();
		List<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		for (int i = 0; i < 6; i++) {
			List<Integer> cp = new ArrayList<>(l);
			cp.remove(i);
			map.put(cp, i);
		}
		System.out.println(map);
		List<Integer> test = new ArrayList<>();
		test.add(1);
		test.add(2);
		test.add(3);
		test.add(5);
		test.add(6);
		System.out.println(map.get(test));
	}
}
