public class Caneta {
   private String modelo;
   private float ponta;
   private boolean tampada;
   private String cor;

    public Caneta(String m, String c, float p) { //Este é o método construtor (note que o "C" de "Caneta" é maiúsculo, assim como a classe)
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
    }
    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta (float p) {
        this.ponta = p;
    }

    public void tampar() {
       this.tampada = true;
    }

    public void destampar() {
       this.tampada = false;
    }
    public void status() {
        System.out.println("Especificações da caneta:");
                                        //this.modelo
        System.out.println("Modelo: " + this.getModelo());
                                        //this.ponta
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Está tampada: " + this.tampada);
    }
}
