package defaultmethods;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Exercicio_forEach {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		
		Consumer<String> consumidor = new ImprimeNaLinha2();
		palavras.forEach(consumidor);
	}

}

class ImprimeNaLinha2 implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t);
	}
	
}
