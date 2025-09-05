public class Main {
    public static void main(String[] args) {
        int[]A = new int[] {12,35,52,64};
        int[]B = new int[] {5,15,23,55,75};
        int tam_A = 4;
        int tam_B = 5;
        int tam_C = tam_A+tam_B;
        int []C = Merge.merge(A, tam_A, B, tam_B);
        System.out.println("Mostrando vetor resultante do merge\n");



        for(int i =0;i < tam_C;i++){
            System.out.print(C[i]+" ");
        }

    }
}