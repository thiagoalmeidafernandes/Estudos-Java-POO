public final class Tecnico extends Aluno{
    private String registroProfissional;

    public void praticar(){
        System.out.println("O aluno técnico " + this.getNome() + " está praticando suas competências.");
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
