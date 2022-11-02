public class Pessoa {
    private String pessoa;
    private int idade;
    private char sexo;

    public void fazerAniver(){
        this.setIdade(this.getIdade() + 1);
    }

    public Pessoa(String pessoa, int idade, char sexo) {
        this.pessoa = pessoa;
        this.idade = idade;
        this.sexo = sexo;
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
}
