import java.util.Scanner;

class Condicionais{
     public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite entre 1 e 7: ");
        int diaSemana = scan.nextInt();
        


        if(diaSemana == 1){
            System.out.println("Segunda");
        } else if(diaSemana == 2){
            System.out.println("Terça");
        } else if(diaSemana == 3){
            System.out.println("Quarta");
        } else if(diaSemana == 4){
            System.out.println("Quinta");
        } else if(diaSemana == 5){
            System.out.println("Sexta");
        } else if(diaSemana == 6){
            System.out.println("Sabado");
        } else if(diaSemana == 7){
            System.out.println("Domingo");
        } if ( diaSemana > 7 && diaSemana < 1){
            System.out.println("Invalido");
        }
     
     // ----------------- SWITCH ------------------------
     
         System.out.println("-------------------");
         System.out.println("  SWITCH  ");
         System.out.println("-------------------");

     switch(diaSemana){
        case 1: System.out.println("Segunda"); break;
        case 2: System.out.println("terca"); break;
        case 3: System.out.println("quarta"); break;
        case 4: System.out.println("quinta"); break;
        case 5: System.out.println("sexta"); break;
        case 6: System.out.println("sabado"); break;
        case 7: System.out.println("domingo"); break;
        default : System.out.println("Não é um dia valido"); 
     
     }


    


     }

}