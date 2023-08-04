import java.util.Scanner;
public class Tarefa1 {



    public static int estaOrdenado1(char[] vetor) {
        final int tamanho = vetor.length - 1; // compiladores gostam de valores em cache

        int i = 0;
        while (Character.toLowerCase(vetor[i + 1]) > Character.toLowerCase(vetor[i])
                && i++ < tamanho - 1)
            ;
        if (i == tamanho)
            return 0;
        return 1;
    }

    public static int estaOrdenado2(char[] vetor) {
        final int tamanho = vetor.length - 1; // compiladores gostam de valores em cache no loop
        for (int i = 0; i < tamanho; ++i) {

            char letraAtual = Character.toLowerCase(vetor[i]);
            char proximaLetra = Character.toLowerCase(vetor[i + 1]);
            if (proximaLetra < letraAtual)
                return 1;

        }
        return 0;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            char[] vetor = new char[6];
            for (int i = 0; i < 6; ++i) {
                vetor[i] = scanner.nextLine().charAt(0);
            }
            System.out.println(vetor);
            System.out.println(
                    estaOrdenado2(vetor) == 0 ? "Ordenado" : "Nao ordenado");
        }
    }


    
}