
import java.util.Scanner;

class Operadores{
     public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um valor A: ");
        int a = scan.nextInt();

        System.out.println("Insira um valor B: ");
        int b = scan.nextInt();
        
        System.out.println("Soma: ");
        int soma = a + b;
        System.out.println(soma);

        System.out.println("Multiplicacao: ");
        int mul = a * b;
        System.out.println(mul);

        System.out.println("Divisão: ");
        int div = a / b;
        int resto = a % b;
        System.out.println(div);

        System.out.println("resto: ");
        System.out.println(resto);

        System.out.println("--------");
        System.out.println(a++);
        System.out.println(++a);

      // condicionais 
         System.out.println("-------------------");
         System.out.println("  CONDICIONAIS  ");
         System.out.println("-------------------");

      if ( a >= b ){
         System.out.println("A é maior que B");
      } else {
         System.out.println("A não é maior que B");
      }
     }

}