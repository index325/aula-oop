package encapsulamento;

// Classe principal para teste
public class Encapsulamento {
    public static void main(String[] args) {
        // Criando uma nova conta bancária
        ContaBancaria conta = new ContaBancaria("123456", 1000.0);

        // Tentando sacar mais do que o saldo disponível
        conta.sacar(1500.0);

        // Depositando algum dinheiro
        conta.depositar(500.0);

        // Obtendo o saldo da conta
        System.out.println("Saldo atual: " + conta.getSaldo());
    }
}