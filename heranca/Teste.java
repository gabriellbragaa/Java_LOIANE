
package heranca;

public class Teste{

    public static void main(String[] args){
        Aluno aluno = new Aluno();

        Professor professor = new Professor();
        
        Pessoa pessoa = new Pessoa();

        aluno.setNome("gabriel");
        pessoa.setEndereco("rua JOAO PESSOA");
        professor.setEndereco("rua almegadas");
        aluno.setEndereco("rua joao almeida");

        
        System.out.println(pessoa.obterEtiquetaEndereço());
        System.out.println(professor.obterEtiquetaEndereço());
        System.out.println(aluno.obterEtiquetaEndereço());
    }
}

/* ------------------- PARA COMPILAR ------------------------ 

        javac heranca/*.java

        java heranca.Teste


*/
    
