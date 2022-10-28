public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 90;
        c1.tampada = false;

        c1.destampar();
        c1.status();
        c1.rabiscar();
        c1.tampar();
        System.out.println("");

        Caneta c2 = new Caneta();
        c2.modelo = "Bic";
        c2.cor = "Vermelha";
        c2.ponta = 0.7f;
        c2.carga = 95;
        c2.tampada = false;

        c2.status();
        c2.rabiscar();
        c2.tampar();


    }
}