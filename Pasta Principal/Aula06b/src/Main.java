public class Main {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.specificVolume(70);
        c.maisVolume();
        //c.ligarMudo();
        c.play();
        c.abrirMenu();
    }
}