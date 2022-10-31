import java.util.Objects;

public class ContaBanco {
    //Atributes
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Constructor
    public ContaBanco() {
        this.setSaldo(0f);
        this.setStatus(false);
    }

    //Methods
    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if (Objects.equals(tipo, "CC")) {
            this.setSaldo(50f);
        } else if(Objects.equals(tipo, "CP")){
            this.setSaldo(150f);
        }

    }

    public void fecharConta(){
        if (this.getSaldo() > 0f){
            System.out.println("Você ainda possui saldo na conta.");
        } else if(this.getSaldo() < 0f){
            System.out.println("Você possui saldo devedor ao banco.");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada.");
        }
    }

    public void depositar(float valor){
        if (isStatus()){
            this.setSaldo(getSaldo() + valor);
        } else {
            System.out.println("Você não possui uma conta para depósito.");
        }
    }

    public void sacar(float valor){
        if (isStatus() && valor <= getSaldo()){
            this.setSaldo(getSaldo() - valor);
        } else if (isStatus() && valor > getSaldo()){
            System.out.println("Você não possui saldo suficiente para esta operação.");
        } else {
            System.out.println("Você não possui conta no banco.");
        }
    }

    public void pagarMensal(){
        float mensalidade = 0f;
        if(Objects.equals(getTipo(), "CC")){
            mensalidade = 12f;
        } else if (Objects.equals(getTipo(), "CP")){
            mensalidade = 20f;
        }

        if(isStatus()){
            if(getSaldo() > mensalidade){
                setSaldo(getSaldo() - mensalidade);
            } else {
                System.out.println("Saldo insuficiente para a cobrança da mensalidade.");
            }
        } else {
            System.out.println("Impossível pagar.");
        }
    }

    public void resumoConta(){
        System.out.println("----------------------");
        System.out.println("Proprietário: " + this.getDono());
        System.out.println("Tipo de conta: " + this.getTipo());
        System.out.println("Número da conta: " + this.getNumConta());
        System.out.println("Status da conta: " + this.isStatus());
        System.out.println("Saldo da conta: " + this.getSaldo());
    }

    //Getters and Setters

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}





