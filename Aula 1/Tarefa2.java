import java.util.Scanner;

public class Tarefa2 {



    public static void troca(char[] vetor, int pos1, int pos2) {

        final int pos1Abs = pos1 - 1;
        final int pos2Abs = pos2 - 1;
     
     
        if (
                pos1Abs >= vetor.length
                || pos2Abs >= vetor.length
                || pos1Abs < 0
                || pos2Abs < 0
        ) return;
     
        vetor[pos1Abs] ^= vetor[pos2Abs] ^ (vetor[pos2Abs] = vetor[pos1Abs]);
     
     }
     
     public static void main(String[] args) {
        char[] vetor = new char[]{'O', 'R', 'D', 'E', 'N', 'A'};
     
        try(Scanner scanner = new Scanner(System.in)) {
     
           System.out.println("T R O C A");
           System.out.print("Posicao 1: ");
           int pos1 = scanner.nextInt();
     
           System.out.print("Posicao 2: ");
           int pos2 = scanner.nextInt();
     
           troca(vetor, pos1, pos2);
     
        }
     
        System.out.println(vetor);
     }


     
}
