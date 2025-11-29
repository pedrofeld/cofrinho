package uninter;

import java.util.ArrayList;

public class Cofrinho {
	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
	
	public void adicionar(Moeda moeda) {
        if (moeda != null) {
        	if (moeda instanceof Real) {
                System.out.println("Adicionando Real...");
            } else if (moeda instanceof Dolar) {
                System.out.println("Adicionando Dólar...");
            } else if (moeda instanceof Euro) {
                System.out.println("Adicionando Euro...");
            }
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