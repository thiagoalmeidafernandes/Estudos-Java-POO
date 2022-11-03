public class Cachorro extends Mamifero{
    @Override
    public void emitirSom() {
        System.out.println("Au! Au!");;
    }

    public void reagir(String frase) {
        if(frase.equals("Olá") || frase.equals("Toma comida")){
            System.out.println("Abanar e latir");
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int hora, int min) {

    }

    public void reagir(boolean dono) {
        if (dono) {
            System.out.println("Feliz");
        } else {
            System.out.println("Triste");
        }
    }

    public void reagir(int idade, float peso){

    }
}
