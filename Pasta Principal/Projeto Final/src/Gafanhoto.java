public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;

    public Gafanhoto(String pessoa, int idade, char sexo, String login) {
        super(pessoa, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" +
                "login='" + login + '\'' +
                ", totAssistido=" + totAssistido +
                ", pessoa='" + pessoa + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                ", experiencia=" + experiencia +
                '}';
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
}
