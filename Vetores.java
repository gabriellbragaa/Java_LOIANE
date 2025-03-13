import java.util.Scanner;
import java.util.Arrays; // Import necessário para Arrays.toString()

class Vetores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Entre com o valor da posição " + i + ": ");
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i]; // Copia os valores para vetorB
        }

        // Correção: Exibe os vetores corretamente
        System.out.println("\nValores do vetorA: " + Arrays.toString(vetorA));
        System.out.println("Valores do vetorB: " + Arrays.toString(vetorB));

        scan.close(); // Fecha o Scanner
    }
}
