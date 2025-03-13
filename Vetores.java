
import java.util.Scanner;
import java.util.Arrays; 

class Vetores{

        public static void main(String[] args){

            Scanner scan = new Scanner(System.in);

            int[] vetorA = new int[5];
            int[] vetorB = new int[vetorA.length];

            for(int i=0; i < vetorA.length; i++){
                System.out.println("entre com o valor da posicao: " + i);
                vetorA[i] = scan.nextInt();
                vetorB[i] = vetorA[i];
            }

             System.out.println("entre com o valor do vetorA: ");
             
            for(int i=0; i < vetorA.length; i++){
                System.out.println(vetorA[i] + " ");
            }
            System.out.println();

            System.out.println("entre com o valor do vetorB: ");
            for(int i=0; i < vetorB.length; i++){
                System.out.println(vetorB[i] + " ");
            }
            System.out.println();

        }


}