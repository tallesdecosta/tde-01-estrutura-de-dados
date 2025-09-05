import java.util.Scanner;

public class Main
{
    
    
    
	public static void main(String[] args) 
	{
	    
	    Scanner sc = new Scanner(System.in);
    
        int continuar = 999;
        LinkedList fila = new LinkedList();
        
        while(continuar != 9)
        {
            
            System.out.println("\n");
            System.out.println("1 - Inserir");
            System.out.println("2 - Remover");
            System.out.println("3 - Imprimir");
            System.out.println("9 - Sair");
            System.out.print("Escolha: ");
            
            continuar = sc.nextInt();
            
            if(continuar == 1)
            {
                
                System.out.println("Diga o numero que quer inserir: ");
                int valor = sc.nextInt();
                sc.nextLine();
                fila.insere(valor);
                
            } 
            else if (continuar == 2)
            {
                
                fila.remove();
                
                
            }
            
            else if(continuar == 3)
            {
                System.out.println("Segue impressão do estado atual da fila: ");
                fila.imprime();
                
            }

            else if (continuar == 9)
            {
                System.out.println("Encerrando programa!");
                continuar = 9;
            }
            else
            {
                
                System.out.println(" Opção inválida, tente novamente.");
            
            }
	    
        }
        
        sc.close();
		
		
	}
}