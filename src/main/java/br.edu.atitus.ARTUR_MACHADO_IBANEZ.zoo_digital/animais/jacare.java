package br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.animais;

import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.comportamentos.Predador;

public class Jacare extends Reptil implements Nadador, Predador {
    public Jacare(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está bramindo");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando através do rio");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando pequenos mamíferos desavisados");
    }
    
}