package uninter;

import java.util.ArrayList;

public class Cofrinho {
	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>(); // todas as moedas são tratadas como Moeda
	
	public void adicionar(Moeda moeda) {
        if (moeda != null) {
            listaMoedas.add(moeda);
            System.out.println("Moeda adicionada ao cofrinho :)");
        } else {
            System.out.println("A moeda não pode ser nula :(");
        }
    }
	
	/*
	 * Método remover busca por uma moeda do mesmo tipo e valor antes de remover
	 * Retorna true ou false para confirmar se bombou ou não
	 */
	public boolean remover(Moeda moeda) {
        if (moeda != null) {
        	// Percorre a lista procurando
            for (int i = 0; i < listaMoedas.size(); i++) {
                Moeda m = listaMoedas.get(i);
                
                // Compra tipo e valor
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
	
	public void listagemMoedas() {
		// Verifica se a lista está vazia através do método nativo isEmpty
        if (listaMoedas.isEmpty()) {
            System.out.println("O cofrinho está vazio :(");
            return;
        }
        
        System.out.println("Moedas no Cofrinho:");
        for (Moeda moeda : listaMoedas) {
            moeda.info();
        }
    }
		
	public double totalConvertido() {
        double total = 0;
        for (Moeda moeda : listaMoedas) {
            total += moeda.converter();
        }
        return total;
    }
}