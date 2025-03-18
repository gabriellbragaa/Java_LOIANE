/*********************** HERANÇA ****************************/


package heranca;

public class Aluno extends Pessoa{

    private String curso;
    private double[] notas;

    public Aluno(){
        super();
    }

    public Aluno(String nome, String endereco, String cpf){
        super(nome, endereco, cpf);
        this.curso = curso;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return this.notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        int soma = 0;
        
        for (double nota : notas) { // Percorre o array somando as notas
            soma += nota;
        }
        return (double) soma / notas.length; 
    }

    public boolean alunoAprovado() {
        return calcularMedia() >= 7; 
    }


    public String obterEtiquetaEndereço(){
        
        String s = "endereço aluno: ";
        s += super.getEndereco();
        
        
        return s;
    }

}