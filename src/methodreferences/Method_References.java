package methodreferences;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

//Dada uma lista de Strings, eu quero ordená-las
public class Method_References {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");
		
		palavras.sort((s1, s2) -> {
			if (s1.length() < s2.length())
				return -1;
			if (s1.length() > s2.length())
				return 1;
			return 0;
		});
	
//		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		//O lambda só faz isso: dado um objeto, invoca o método deste objeto. 
		//Neste caso: Dada a String s, chama o length desta String.
		palavras.sort(Comparator.comparing(s -> s.length()));	
		palavras.sort(Comparator.comparing(String::length));	//method reference

//--------------------------------------------------------------------------------------------------------
		//as próxs 8 linhas estão fazendo o mesmo que a linha acima. Mas sem o lambda.
		Function<String, Integer> funcao = new Function<String, Integer>() {
			@Override
			public Integer apply(String s) {
				return s.length();
			}			
		};
		Comparator<String> compardorDeStrings = Comparator.comparing(funcao);
		palavras.sort(compardorDeStrings);
//--------------------------------------------------------------------------------------------------------
		
		System.out.println(palavras);
		
//		Consumer<String> consumidor = new ImprimeNaLinha();
//		palavras.forEach(consumidor);
		
		Consumer<String> impressor = System.out::println;
		palavras.forEach(impressor);
		
		palavras.forEach(System.out::println);
	}

}

class ImprimeNaLinha implements Consumer<String> {

	@Override
	public void accept(String s) {
		System.out.println(s);
	}	
}
