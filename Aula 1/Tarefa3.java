import java.util.Scanner;
import java.io.IOException;

public class Tarefa3 {

    

    public static void cascatear(char[] vetor, int origem, int dest) {

        final int origemAbs = origem - 1;
        final int destinoAbs = dest - 1;
     
        if (
                origemAbs >= vetor.length
                || destinoAbs >= vetor.length
                || origemAbs < 0
                || destinoAbs < 0
        ) return;
     
        for (int i = origemAbs; i < destinoAbs; ++i) {
           vetor[i] ^= vetor[i + 1] ^ (vetor[i + 1] = vetor[i]);
        }
     
     }
     
     public static void main(String[] args) throws IOException {
        char[] vetor = new char[]{'R', 'O', 'N', 'E', 'D', 'A'};
     
        try (Scanner scanner = new Scanner(System.in)) {
           System.out.print("Origem: ");
           int origem = scanner.nextInt();
     
           System.out.print("Destino: ");
           int destino = scanner.nextInt();
     
           cascatear(vetor, origem, destino);
        }
     
        System.out.println(vetor);
     }



}

