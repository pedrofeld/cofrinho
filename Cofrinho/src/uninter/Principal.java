package uninter;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Moeda> lista = new ArrayList<Moeda>();
		
		lista.add(new Real(1000));
		lista.add(new Dolar(100));
		lista.add(new Euro(10));
		
		for( Moeda o : lista ) {
			o.info();
		}
	}

}
