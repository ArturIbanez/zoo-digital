package br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.app;
import java.util.ArrayList;
import java.util.List;

// Import da dependência Maven (Apache Commons Lang)
import org.apache.commons.lang3.StringUtils;

// Imports das Interfaces de Comportamento
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.comportamentos.Voador;

// Imports das Classes de Animais
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.animais.Animal;
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.animais.Gato;
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.animais.Baleia;
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.animais.Ganso;
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.animais.Albatroz;
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.animais.Salmao;
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.animais.PeixePalhaço;


public class Main {
    public static void main(String[] args) {
        
        // Exemplo de uso do Apache Commons Lang
        String hello = "  hello world  ";
        String helloFormated = StringUtils.capitalize(StringUtils.trim(hello));
        System.out.println(helloFormated);


        System.out.println(" ZOO ATITUS");
        System.out.println("Número de animais (INÍCIO): " + Animal.getContador());

        // Lista "Polimórfica"
        List<Animal> zooList = new ArrayList<>();

        // Upcasting: Instancia a subclasse, armazena na lista de Animal
        zooList.add(new Gato("Bolinha", 3, "Siamês"));
        zooList.add(new Baleia("MobDick", 23));
        zooList.add(new Ganso("Oswald", 31, "ganso-do-canadá"));
        zooList.add(new Albatroz("Oslo", 8, "albatroz-gigante"));
        zooList.add(new Salmao("Sushi", 1));
        zooList.add(new PeixePalhaço("Nemo", 2));

        imprimirComportamentos(zooList);

        System.out.println("Número de animais (FINAL): " + Animal.getContador());

    }

    private static void imprimirComportamentos(List<Animal> animais) {
        System.out.println("Comportamentos: ");
        for (Animal animal : animais) {
            animal.emitirSom(); // Polimorfismo
            animal.comer();     // Polimorfismo
            
            // Downcasting Seguro e instanceof:
            // O uso de 'instanceof' é obrigatório para as opções 3, 4, 5 e 6 da CLI.
            
            // Verificar se o "animal" é realmente "Voador"
            if (animal instanceof Voador)
                imprimirVoo((Voador) animal); // Downcasting explícito
            if (animal instanceof Nadador)    
                imprimirNado((Nadador) animal); // Downcasting explícito
            if (animal instanceof Corredor)
                imprimirCorrida((Corredor) animal); // Downcasting explícito
        }
    }

    private static void imprimirVoo(Voador animalVoador) {
        animalVoador.voar();
    }
    private static void imprimirNado(Nadador animalNadador) {
        animalNadador.nadar();
    }
    private static void imprimirCorrida(Corredor animalCorredor){
        animalCorredor.correr();
    }
}