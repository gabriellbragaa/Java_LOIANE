
/******************* RELACIONAMENTO " É UM " ************** */
// pessoa é a MÃE
// como usa extends em professor e aluno 
// não vamos poder acessar o private 


package heranca;

public class Pessoa{

    private String nome;
    private String endereco;
    private String cpf;

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





}