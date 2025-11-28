package uninter;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Mae> lista = new ArrayList<Mae>();
		
		lista.add(new Filha1("1"));
		lista.add(new Filha3("2"));
		lista.add(new Filha3("3"));
		
		for( Mae o : lista ) {
			o.info();
		}
	}

}
