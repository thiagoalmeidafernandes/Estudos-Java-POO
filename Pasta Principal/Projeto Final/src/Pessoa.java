public abstract class Pessoa {
    protected String pessoa;
    protected int idade;
    protected char sexo;
    protected float experiencia;

    public Pessoa(String pessoa, int idade, char sexo) {
        this.pessoa = pessoa;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }

    protected void ganharExp(){

    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "pessoa='" + pessoa + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                ", experiencia=" + experiencia +
                '}';
    }
}
