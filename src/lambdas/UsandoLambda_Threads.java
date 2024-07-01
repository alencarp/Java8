package lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class UsandoLambda_Threads {

	public static void main(String[] args) {

		
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Executando um Runnable");
			}
			
		}).start();
		
		new Thread(() -> System.out.println("Executando um Runnable")).start();
		

	}

}

