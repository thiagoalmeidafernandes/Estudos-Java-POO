public class Main {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        p1.setNumConta(1111);

        ContaBanco p2 = new ContaBanco();
        p2.setDono("Creusa");
        p2.abrirConta("CP");
        p2.setNumConta(2222);

        p1.depositar(100f);
        p2.depositar(500f);
        p2.sacar(100f);

        p1.sacar(150f);
        //p1.fecharConta();

        p2.pagarMensal();

        p1.resumoConta();
        p2.resumoConta();

    }
}