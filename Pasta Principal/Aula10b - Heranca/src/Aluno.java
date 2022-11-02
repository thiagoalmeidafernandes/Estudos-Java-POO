public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno " +this.nome);
    }
    public void cancelarMatricula() {
        System.out.println("A matrícula será cancelada.");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", curso='" + curso + '\'' +
                '}';
    }
}
