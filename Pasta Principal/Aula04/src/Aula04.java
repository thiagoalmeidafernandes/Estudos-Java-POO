public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Bic", "Azul", 0.7f);

        //c1.modelo = "Bic";
        //c1.setModelo("Bic");
        //c1.ponta = 0.7f
        //c1.setPonta(0.7f);

        c1.status();

        System.out.println("A melhor caneta é a " + c1.getModelo() + " de ponta " + c1.getPonta());


    }
}