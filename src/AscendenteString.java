import java.util.Comparator;

public class AscendenteString implements Comparator <String> {

	@Override
	public int compare(String o1, String o2) {
		System.out.println("O1: "+o1);
		System.out.println("O2: "+o2);
		System.out.println(o1.compareTo(o2));
		return o1.compareTo(o2);
	}

}
