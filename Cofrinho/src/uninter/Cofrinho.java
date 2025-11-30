package uninter;

import java.util.ArrayList;

public class Cofrinho {
	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
	
	public void adicionar(Moeda moeda) {
        if (moeda != null) {
            listaMoedas.add(moeda);
            System.out.println("Moeda adicionada ao cofrinho :)");
        } else {
            System.out.println("A moeda não pode ser nula :(");
        }
    }
	
	// public remover(Moeda);
	
	// public listagemMoedas();
		
	// public totalConvertido();
}