package heranca;

// Classe base ou superclasse
class Animal {
    String nome;
    int idade;

    // Construtor
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para emitir um som genérico
    public void emitirSom() {
        System.out.println("O animal está emitindo um som.");
    }
}

// Subclasse heranca.Cachorro que herda da classe heranca.Animal
class Cachorro extends Animal {
    // Construtor
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    // Sobrescrita do método emitirSom
    @Override
    public void emitirSom() {
        System.out.println("O cachorro está latindo: Au Au!");
    }

    // Método específico da classe heranca.Cachorro
    public void abanarRabo() {
        System.out.println("O cachorro está abanando o rabo.");
    }
}

// Subclasse heranca.Gato que herda da classe heranca.Animal
class Gato extends Animal {
    // Construtor
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    // Sobrescrita do método emitirSom
    @Override
    public void emitirSom() {
        System.out.println("O gato está miando: Miau!");
    }

    // Método específico da classe heranca.Gato
    public void arranharMoveis() {
        System.out.println("O gato está arranhando os móveis.");
    }
}

// Classe principal para teste
public class Heranca {
    public static void main(String[] args) {
        // Criando objetos das subclasses
        Cachorro meuCachorro = new Cachorro("Rex", 5);
        Gato meuGato = new Gato("Whiskers", 3);

        // Chamando métodos das subclasses
        meuCachorro.emitirSom();
        meuCachorro.abanarRabo();

        meuGato.emitirSom();
        meuGato.arranharMoveis();
    }
}