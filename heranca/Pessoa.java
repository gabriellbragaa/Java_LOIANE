
/******************* RELACIONAMENTO " É UM " ************** */
// Pessoa é uma classe MÃE
// como usa extends em professor e aluno 
// não vamos poder acessar o private 

/******************* HERANÇA E POLIMOFISMO **************** */
// 
// Foi feito o uso das superclasses na qual o teste é possivel
// que seja realizado o acesso ao endereço na classe Pessoa
// que é um atributo privado. Alternativa essa, bastante 
// interessante de se abordar
//
//


package heranca;

public class Pessoa{

    private String nome;
    private String endereco;
    private String cpf;

    // Construtor sem parâmetros 
    public Pessoa() {
    
        this.nome = "";
        this.endereco = "";
        this.cpf = "";
    }

    // Construtor com parâmetros
    public Pessoa(String nome, String endereco, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String obterEtiquetaEndereço(){
        return this.endereco;
    }


}