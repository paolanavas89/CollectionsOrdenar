import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		S.useDelimiter("\r\n");
		char orden;
		ArrayList<String> palabras=new ArrayList<>();
		palabras.add("Paola");
		palabras.add("Ana");
		palabras.add("María");
		
		do {
		System.out.println("Introduzca el orden (A/D)");
		orden=S.next().toUpperCase().charAt(0);
		}while(orden!= 'A' && orden !='D');
		ordenar2(palabras,orden);
	}
	
	//metodo padre
	public static void ordenar(List <String> lista,char orden) {
		
		Collections.sort(lista);
		if(Character.toUpperCase(orden)=='A') {
			Iterator<String> it = lista.iterator();
			while (it.hasNext()) {	
				String valor=it.next();
				System.out.println(valor);
			}
		}else {
			ListIterator<String> it = lista.listIterator(lista.size());
			while (it.hasPrevious()) {	
				String valor=it.previous();
				System.out.println(valor);
			}
		}
		
		
	}
	public static void ordenar2(List <String> lista,char orden) {
		
		if(Character.toUpperCase(orden)=='A') {
			Collections.sort(lista, new AscendenteString() );
		}
		else {
			Collections.sort(lista, new DescendenteString());
		}
		
		for(String i : lista) {
			System.out.println(i);
		}
	}
	
	
	
	

}
