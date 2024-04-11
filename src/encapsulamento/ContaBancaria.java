package encapsulamento;

// Classe encapsulamento.ContaBancaria que utiliza encapsulamento para ocultar o saldo
public class ContaBancaria {
    private String numeroConta;
    private double saldo;

    // Construtor
    public ContaBancaria(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    // Método para depositar dinheiro na conta
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso. Novo saldo: " + saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para sacar dinheiro da conta
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso. Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    // Método para obter o saldo da conta (encapsulado)
    public double getSaldo() {
        return saldo;
    }
}
