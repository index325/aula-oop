package abstracao;

// Classe abstrata Veículo
abstract class Veiculo {
    protected String modelo;
    protected int ano;

    // Construtor
    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    // Método abstrato para obter a descrição do veículo
    abstract String obterDescricao();
}

// Classe abstracao.Carro que estende abstracao.Veiculo
class Carro extends Veiculo {
    private int numPortas;

    // Construtor
    public Carro(String modelo, int ano, int numPortas) {
        super(modelo, ano);
        this.numPortas = numPortas;
    }

    public Carro(String modelo, int ano) {
        super(modelo, ano);
    }

    // Implementação do método abstrato
    @Override
    String obterDescricao() {
        return "abstracao.Carro: " + modelo + ", Ano: " + ano + ", Número de Portas: " + numPortas;
    }
}

// Classe abstracao.Moto que estende abstracao.Veiculo
class Moto extends Veiculo {
    private String tipo;

    // Construtor
    public Moto(String modelo, int ano, String tipo) {
        super(modelo, ano);
        this.tipo = tipo;
    }

    // Implementação do método abstrato
    @Override
    String obterDescricao() {
        return "abstracao.Moto: " + modelo + ", Ano: " + ano + ", Tipo: " + tipo;
    }
}

// Classe principal para teste
public class Abstracao {
    public static void main(String[] args) {
        // Criando objetos de abstracao.Carro e abstracao.Moto
        Carro meuCarro = new Carro("Toyota Corolla", 2022, 4);
        Moto minhaMoto = new Moto("Honda CB500X", 2021, "Crossover");

        // Obtendo descrição dos veículos
        System.out.println(meuCarro.obterDescricao());
        System.out.println(minhaMoto.obterDescricao());
    }
}