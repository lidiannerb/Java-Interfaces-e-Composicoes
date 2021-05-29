package libank.herdado.conta;

public class TesteContas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100.00);

        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(200);

        cc.transfere(10.0, cp); // Ex de polimorfismo: o método saca(transfere) herdado da classe Conta não especifica se Conta corrente ou poupança, mesmo assim  funcionou o método especíco de conta corrente, sobrescrito

    System.out.println("Saldo conta corrente: " + cc.getSaldo());
    System.out.println("Saldo conta poupança: " + cp.getSaldo());

    }
}
