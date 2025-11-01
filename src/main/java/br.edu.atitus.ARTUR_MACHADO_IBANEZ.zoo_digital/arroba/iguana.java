package br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.animais;

import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.comportamentos.Predador;

public class Iguana extends Reptil implements Corredor, Predador {
    public Iguana(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está quieta");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo rapidamente pela vegetação baixa");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando pequenos mamíferos e insetos");
    }
    

}