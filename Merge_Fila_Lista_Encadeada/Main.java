import java.util.Scanner;

public class Main
{
    
    
    
	public static void main(String[] args) 
	{
	    
	    Scanner sc = new Scanner(System.in);
    
        int continuar = 999;
        LinkedList filaA = new LinkedList();
        LinkedList filaB = new LinkedList();
        
        while(continuar != 9)
        {
            System.out.println("\n");
            System.out.println("Você pode fazer as seguintes operações (exceto merge) em duas listas, A e B.");
            System.out.println("\n");
            System.out.println("1 - Inserir");
            System.out.println("2 - Remover");
            System.out.println("3 - Imprimir");
            System.out.println("4 - Gerar merge");
            System.out.println("9 - Sair");
            System.out.print("Escolha: ");
            
            continuar = sc.nextInt();
            
            if(continuar == 1)
            {
                System.out.println("Diga em qual fila  quer inserir: ");
                System.out.println("\n");
                System.out.println("1 - A");
                System.out.println("2 - B");
                int listaInserir = sc.nextInt();
                
                    if(listaInserir == 1)
                    {
                        
                        System.out.println("Diga o numero que quer inserir: ");
                        int valor = sc.nextInt();
                        sc.nextLine();
                        filaA.insere(valor);
                        
                    } else if(listaInserir == 2)
                    {
                        
                        System.out.println("Diga o numero que quer inserir: ");
                        int valor = sc.nextInt();
                        sc.nextLine();
                        filaB.insere(valor);
                        
                    }
                
                
            } 
            else if (continuar == 2)
            {
                
                
                System.out.println("Diga de qual fila quer remover: ");
                System.out.println("\n");
                System.out.println("1 - A");
                System.out.println("2 - B");
                int listaRemover = sc.nextInt();
                
                    if(listaRemover == 1)
                    {
                        
                        filaA.remove();
                        
                    } else if(listaRemover == 2)
                    {
                        
                        filaB.remove();
                        
                    }
                
                
            }
            
            else if(continuar == 3)
            {
                
                
                System.out.println("Diga qual fila quer imprimir: ");
                System.out.println("\n");
                System.out.println("1 - A");
                System.out.println("2 - B");
                int listaImprimir = sc.nextInt();
                
                    if(listaImprimir == 1)
                    {
                        System.out.println("Segue impressão do estado atual da fila: ");
                        filaA.imprime();
                        
                    } else if(listaImprimir == 2)
                    {
                        System.out.println("Segue impressão do estado atual da fila: ");
                        filaB.imprime();
                        
                    }
                
            }
            
            else if(continuar == 4)
            {
                
                Merge merge = new Merge();
                LinkedList C = merge.fazerMerge(filaA, filaB);
                System.out.println("Segue impressão da fila criada por merge: ");
                C.imprime();
                
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