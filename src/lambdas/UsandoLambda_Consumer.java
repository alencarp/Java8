package lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class UsandoLambda_Consumer {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");
		
//		Comparator<String> comparador = new Comparador();
		palavras.sort(new Comparador());
		
		System.out.println(palavras);
		
//		Consumer<String> impressor = s -> System.out.println(s);
//		palavras.forEach(impressor);
		
		palavras.forEach(s -> System.out.println(s));
	}

}

//class ImprimeNaLinha implements Consumer<String> {
//
//	@Override
//	public void accept(String s) {
//		System.out.println(s);
//	}	
//}


class Comparador implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length())
			return -1;
		if (s1.length() > s2.length())
			return 1;
		return 0;
	}
}
