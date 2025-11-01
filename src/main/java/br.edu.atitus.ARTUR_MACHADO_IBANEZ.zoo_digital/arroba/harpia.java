package br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.animais;

import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.comportamentos.Voador;
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.comportamentos.Predador;

public class Harpia extends Reptil implements Voador, Predador {
    public Harpia(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está emitindo um grito agudo");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando na densa Amazônia");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando pequenos mamíferos e roedores");
    }
    

}