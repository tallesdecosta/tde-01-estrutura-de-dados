

public class Merge {


    public static int [] merge (int []A,int tam_A, int [] B,int tam_B ){

        int [] c= new int[tam_A + tam_B];
        int indice_A =0;
        int indice_B = 0;
        int indice_C =0;

        while(indice_A < tam_A && indice_B < tam_B){
            if(A[indice_A ] <= B[indice_B]){
                c[indice_C] = A[indice_A];
                System.out.println(" Foi colocado o numero " + A[indice_A] + " na posicao "+ indice_C);
                indice_A++;
                
            }
            else{
                c[indice_C] = B[indice_B];
                System.out.println(" Foi colocado o numero " + B[indice_B] + " na posicao "+ indice_C);  
                indice_B++;
            }
            indice_C++;
        }

            // Caso sobre alguma coisa 
            if(indice_A < tam_A){
                while(indice_A< tam_A){
                    c[indice_C] = A[indice_A];
                    System.out.println(" Foi colocado o numero " + A[indice_A] + " na posicao "+ indice_C);
                    indice_A++;
                    indice_C++;

                }
            }

            if(indice_B < tam_B){
                while(indice_B< tam_B){
                    c[indice_C] = B[indice_B];
                    System.out.println(" Foi colocado o numero " + B[indice_B] + " na posicao "+ indice_C);
                    indice_B++;
                    indice_C++;
                }
            }
        


        return c;

    }
}
