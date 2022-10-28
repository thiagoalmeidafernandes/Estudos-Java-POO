public class Notebook {
    String marca;
    String modelo;
    String cor;
    float tamTela;
    String teclado;
    String cpu;
    float clock;
    String armazenamento;
    int nonVolatileMem;
    int ram;
    int ciclos;
    boolean aberto;

    void status(){
        System.out.println("Especificações do Notebook");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tamanho da Tela: " + this.tamTela + '"');
        System.out.println("Teclado (Método de Entrada): " + this.teclado);
        System.out.println("Processador: " + this.cpu);
        System.out.println("Clock: " + this.clock + "GHz");
        System.out.println("Armazenamento: " + this.nonVolatileMem + "GB " + this.armazenamento);
        System.out.println("RAM: " + this.ram + "GB");
        System.out.println("Ciclos de bateria: " + this.ciclos);
        System.out.println("Está aberto: " + this.aberto);

    }

    void abrir(){
        this.aberto = true;
        System.out.println("Notebook aberto, pronto para trabalhar.");
    }

    void fechar(){
        this.aberto = false;
    }

    void trabalhar(){
        System.out.println("");
        if (this.aberto){
            System.out.println("Bora trabalhar!!!");
        } else {
            System.out.println("Não consigo trabalhar com o notebook fechado.");
        }
    }
}
