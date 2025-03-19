/*******************  TRATAMENTO DE ERROS  ******************/ 

// Thy e Catch 



import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {                                                                // try: vai executar o codigo
            System.out.print("Digite um número inteiro: ");
            
            int numero = scanner.nextInt(); 
            
            int resultado = 10 / numero; 
            int divisivel = 10 % numero;

            System.out.println("Resultado da divisão: " + resultado);
            System.out.println("Resto da divisão: " + divisivel);

            if(numero % 2 != 0){
                throw new Exception("Número impar, divisão não exata. ");
            }

        } catch (InputMismatchException e) {                                            // catch: vai executar a excessao 
            System.out.println("Erro: Você deve digitar um número inteiro válido.");
            System.exit(0);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível dividir por zero!");
            System.exit(0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Tentativa de acessar um índice inválido do array.");
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());                   // getMessage
            e.printStackTrace(); // mostra onde foi o erro esperado
        } finally {                                                                     // finally: vai aparecer independente do resultado
            System.out.println("Bloco finally: Finalizando o programa...");
        }

        System.out.println("Execução continua após o tratamento das exceções.");
    }
}

