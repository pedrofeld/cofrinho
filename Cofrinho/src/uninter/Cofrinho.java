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
	
	public boolean remover(Moeda moeda) {
        if (moeda != null) {
            for (int i = 0; i < listaMoedas.size(); i++) {
                Moeda m = listaMoedas.get(i);
                
                if (m.getClass() == moeda.getClass() && m.valor == moeda.valor) {
                    listaMoedas.remove(i);
                    System.out.println("Moeda removida do cofrinho :)");
                    return true;
                }
            }
            System.out.println("Moeda não encontrada no cofrinho :(");
            return false;
        } else {
            System.out.println("A moeda não pode ser nula :(");
            return false;
        }
    }
	
	// public listagemMoedas();
		
	// public totalConvertido();
}