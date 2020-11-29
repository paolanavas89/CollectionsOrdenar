import java.util.Comparator;

public class DescendenteString implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		System.out.println("O1: "+o1);
		System.out.println("O2: "+o2);
		System.out.println(o2.compareTo(o1));
		return o2.compareTo(o1);
	}

}
