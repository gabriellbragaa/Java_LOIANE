
package heranca;

public class Professor extends Pessoa{

    
    private String departamento;
    private String nomeCurso;
    private double salario;


    public Professor(){
        super();
    }

    public Professor(String nome, String endereco, String cpf, double salario) {
        super(nome, endereco, cpf); // Chama o construtor correto da superclasse
        this.salario = salario;
    }


    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNomeCurso() {
        return this.nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularSalario(){
        return salario;
    }

    public String obterEtiquetaEndereço(){
        
        String s = "endereço professor: ";
        s += super.getEndereco();
        
        
        return s;
    }

}