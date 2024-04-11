package polimorfismo;

// Interface heranca.polimorfismo.Animal
interface Animal {
    void emitirSom();
}

// Classes que implementam a interface heranca.polimorfismo.Animal
class Cachorro implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("O cachorro está latindo: Au Au!");
    }
}

class Gato implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("O gato está miando: Miau!");
    }
}

// Classe principal para teste
public class Polimorfismo {
    public static void main(String[] args) {
        // Criando array de objetos heranca.polimorfismo.Animal
        Animal[] animais = new Animal[2];
        animais[0] = new Cachorro();
        animais[1] = new Gato();

        // Chamando o método emitirSom de forma polimórfica
        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}