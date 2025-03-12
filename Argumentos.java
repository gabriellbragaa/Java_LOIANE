
import java.util.Scanner;

class Argumentos{
    public static void main(String[] args){
   // System.out.println("digitou " + args[0]);
   
    Scanner scan = new Scanner(System.in);

    System.out.println("digite seu nome: ");
    String nomeCompleto =  scan.nextLine(); // ler a linha inteira
    System.out.println("Seu nome é: " + nomeCompleto);

    System.out.println("digite seu nome novamente: ");
    String primeiroNome = scan.next();
    System.out.println("Seu primeiro nome é: " + primeiroNome);

    }
}

// java Argumentos CursoJava