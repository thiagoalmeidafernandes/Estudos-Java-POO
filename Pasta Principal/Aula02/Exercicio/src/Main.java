public class Main {
    public static void main(String[] args) {
        Notebook sFlash = new Notebook();
        sFlash.marca = "Samsung";
        sFlash.modelo = "Flash";
        sFlash.cor = "Grafite";
        sFlash.tamTela = 13.3f;
        sFlash.teclado = "ABNT2";
        sFlash.cpu = "Intel Celeron";
        sFlash.clock = 1.1f;
        sFlash.armazenamento = "SSD eMMC";
        sFlash.nonVolatileMem = 64;
        sFlash.ram = 4;
        sFlash.ciclos = 140;
        sFlash.aberto = false;

        sFlash.status();
        sFlash.trabalhar();
        sFlash.abrir();
        sFlash.trabalhar();

    }
}