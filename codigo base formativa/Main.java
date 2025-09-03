/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {

		LinkedList lista = new LinkedList();
		Node nodeCinquenta = lista.inserePrimeiro(50);
		lista.inserePrimeiro(2);
		lista.insereUltimo(4);
		lista.imprime();
		lista.removeUltimo();
		System.out.println("\n");
		lista.imprime();
		lista.removePrimeiro();
		System.out.println("\n");
		lista.imprime();
		Node remover = lista.inserePrimeiro(1);
		Node nodeDois = lista.inserePrimeiro(2);
		System.out.println("\n");
		lista.imprime();
		System.out.println("\n");
		lista.removeNode(remover);
		System.out.println("\n");
		lista.imprime();
        System.out.println("\n");
		Node nodeOitenta = lista.insereOrdenado(80);
		lista.imprime();
		lista.insereDepois(nodeDois, 20);
		System.out.println("\n");
		lista.imprime();
	}

}