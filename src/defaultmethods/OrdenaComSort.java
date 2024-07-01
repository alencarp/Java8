package defaultmethods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/**
 * Ordene a lista pelo tamanho da String como critério de comparação. 
 * @author patricia
 *
 */
public class OrdenaComSort {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
//		Comparator<String> comparador = new ComparaLista();
		palavras.sort(new ComparaLista());
		
		System.out.println(palavras);  //imprime a lista		
	}

}



class ComparaLista implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length())
			return -1;
		if (s1.length() > s2.length())
			return 1;
		return 0;
	}
	
}