package uninter;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();
        
        int opcao;
        
        // Loop do menu
        do {
            System.out.println("COFRINHO");
            System.out.println("1 - Adicionar Moeda");
            System.out.println("2 - Remover Moeda");
            System.out.println("3 - Listar Moedas");
            System.out.println("4 - Calcular total convertido para Real");
            System.out.println("0 - Encerrar");
            
            opcao = teclado.nextInt();
            
            switch (opcao) {
                case 1:
                    adicionarMoeda(teclado, cofrinho);
                    break;
                case 2:
                    removerMoeda(teclado, cofrinho);
                    break;
                case 3:
                    cofrinho.listagemMoedas();
                    break;
                case 4:
                    double total = cofrinho.totalConvertido();
                    System.out.printf("Total convertido para Real: R$ %.2f%n", total);
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
            
        } while (opcao != 0);
        
        teclado.close(); // libera os recursos do scanner ao encerrrar o programa
    }
    
	/*
	 * Método p fazer a interface
	 * Solicita e recebe dados
	 * Cria o objeto e o adc ao cofrinho
	 */
    private static void adicionarMoeda(Scanner teclado, Cofrinho cofrinho) {
        System.out.println("Escolha Moeda:");
        System.out.println("1 - Real");
        System.out.println("2 - Dólar");
        System.out.println("3 - Euro");
        
        int tipoMoeda = teclado.nextInt();
        System.out.println("Digite o valor: ");
        double valor = teclado.nextDouble();
        
        Moeda moeda;
        
        switch (tipoMoeda) {
            case 1:
                moeda = new Real(valor);
                break;
            case 2:
                moeda = new Dolar(valor);
                break;
            case 3:
                moeda = new Euro(valor);
                break;
            default:
                System.out.println("Tipo de moeda inválido!");
                return;
        }
        
        cofrinho.adicionar(moeda);
    }
    
    /*
     * Método p fazer a interface
     * Solicita e recebe dados
     * Cria um novo objeto (temporário) com o valor
     * Solicita ao método do cofrinho p fazer a remoção (que verifica se existe um objeto com aquele valor e o remove)
     */
    private static void removerMoeda(Scanner teclado, Cofrinho cofrinho) {
        System.out.println("Escolha Moeda");
        System.out.println("1 - Real");
        System.out.println("2 - Dólar");
        System.out.println("3 - Euro");
        
        int tipoMoeda = teclado.nextInt();
        System.out.println("Digite o valor: ");
        double valor = teclado.nextDouble();
        
        Moeda moeda;
        
        switch (tipoMoeda) {
            case 1:
                moeda = new Real(valor);
                break;
            case 2:
                moeda = new Dolar(valor);
                break;
            case 3:
                moeda = new Euro(valor);
                break;
            default:
                System.out.println("Tipo de moeda inválido");
                return;
        }
        
        cofrinho.remover(moeda);
    }

}