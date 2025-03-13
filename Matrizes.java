
import java.util.Arrays;
import java.util.Random;

// MATRIZES SÃO ARREY DE ARREYS


class Matrizes{

    public static void main(String[] args){

        int[][] numerosAleatorios = new int[30][4];

        Random numeroRandom = new Random(); // gera numeros aleatorios

        for(int i = 0 ; i < numerosAleatorios.length ; i++){
            for(int j = 0; j < numerosAleatorios[i].length ; j++ ){
                numerosAleatorios[i][j] = numeroRandom.nextInt(100); // vai gerar numeros de 0 a 100
            }
        }
        // determina o maior numero da matrix

        int maior = 0;
        int menor = Integer.MAX_VALUE;
        int linha = 0;
        int coluna = 0;
        int colunamenor = 0;
        int linhamenor = 0;
        

        for(int i = 0 ; i < numerosAleatorios.length ; i++){
            for(int j = 0; j < numerosAleatorios[i].length ; j++ ){
                if (numerosAleatorios[i][j] > maior){
                    maior = numerosAleatorios[i][j];
                    linha = i;
                    coluna = j;
                }
                if( numerosAleatorios[i][j] < menor){
                    menor = numerosAleatorios[i][j];
                    linhamenor = i; 
                    colunamenor = j;
                }
            }
        }
        // exibir matrix
         for(int i = 0 ; i < numerosAleatorios.length ; i++){
            for(int j = 0; j < numerosAleatorios[i].length ; j++ ){
                System.out.printf("%4d ", numerosAleatorios[i][j]);
                }
                System.out.println( " ");
            }
        System.out.println("maior valor é: " + maior);
        System.out.println("menor valor é: " + menor);
        System.out.println();
        System.out.println("linha do maior valor é: " + linha);
        System.out.println("coluna do maior valor é: " + coluna);
        System.out.println();
        System.out.println("linha do menor valor é: " + linhamenor);
        System.out.println("coluna do menor valor é: " + colunamenor);
        System.out.println();
    }





}