/*********************** HERANÇA ****************************/


package heranca;

public class Aluno extends Pessoa{

    private String curso;
    private double[] notas;


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

    public double calcularMedia(){
        return 0;
    }

    public double alunoAprovado(){
        return 0;
    }


}