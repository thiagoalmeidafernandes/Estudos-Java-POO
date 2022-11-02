import java.util.Objects;
import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2){
        if (Objects.equals(l1.getCategoria(),l2.getCategoria()) && l1 != l2){
            this.setAprovada(true);
            this.setDesafiado(l2);
            this.setDesafiante(l1);
        } else {
            this.setAprovada(false);
            this.setDesafiante(null);
            this.setDesafiado(null);
        }
    }

    public void lutar(){
        if (this.isAprovada()){
            System.out.println("___DESAFIANTE___");
            this.desafiante.apresentar();
            System.out.println("___DESAFIADO___");
            this.desafiado.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); //0, 1 ou 2.
            System.out.println("======RESULTADO======");
            switch (vencedor) {
                case 0 -> { //Empate
                    System.out.println("Empate!!!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                }
                case 1 -> { //Desafiado vence
                    System.out.println("O desafiado " + this.desafiado.getNome() + " venceu a luta!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                }
                case 2 -> { //Desafiante vence
                    System.out.println("O desafiante " + this.desafiante.getNome() + " venceu a luta!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                }
            }
            System.out.println("====================");

        } else {
            System.out.println("A luta não foi aprovada.");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
