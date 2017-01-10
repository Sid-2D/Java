import java.util.*;

public class Collection {
	public static void main (String args[]) {
		Map <String, String> hm = new HashMap<>();
		hm.put("hello", "1");
		hm.put("hellos", "1");
		hm.put("hi", "2");
		Set s = hm.entrySet();
		Iterator <Map.Entry> i = s.iterator();
		while (i.hasNext()) {
			Map.Entry <String, String> e = i.next();
			String k = (String)e.getKey();
			String v = (String)e.getValue();
			System.out.println(k + " = " + v);
		}

		TreeSet <String> ts = new TreeSet<>();
		ts.add("Red");
		ts.add("Orange");
		ts.add("Blue");
		ts.add("Green");
		ts.add("White");
		System.out.println(ts);
		Iterator <String> ti = ts.iterator();
		while (ti.hasNext()) {
			System.out.println(ti.next());
		}

		ArrayList <String> al = new ArrayList<>();
		al.add("one");
		al.add("two");
		al.add("three");
		System.out.println(al.size());
		System.out.println(al);
		Iterator <String> ai = al.iterator();
		while (ai.hasNext()) {
			System.out.println(ai.next());
		}
		for (int j = 0; j <= 10; j++) {
			int randomNumber = (int)(Math.random() * 6 + 1);
			System.out.println(randomNumber);
		}
	}
}