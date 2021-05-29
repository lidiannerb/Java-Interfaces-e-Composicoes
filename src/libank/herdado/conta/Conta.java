package libank.herdado.conta;

public abstract class Conta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;


    public Conta(int agencia, int numero){
        Conta.total++;
        //System.out.println("O total de contas é " + Conta.total); coment para focar na herança nas subclasses
        this.agencia = agencia;
        this.numero = numero;
        //this.saldo = 100;  coment para focar na herança nas subclasses
        //System.out.println("Estou criando uma conta " + this.numero); coment para focar na herança nas subclasses
    }

    public abstract void deposita(double valor); //exemplo tornando um método abstrato e obrigando as subclasses a implemetá-lo nelas


    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {  // funciona para cp e cc
        if(this.saca(valor)) {
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
        if(agencia <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }

}