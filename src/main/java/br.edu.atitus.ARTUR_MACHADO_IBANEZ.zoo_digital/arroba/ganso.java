package br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.animais;

import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.comportamentos.Voador;

public class Ganso extends Ave implements Voador, Nadador, Corredor{
    public Ganso(String nome, int idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está grasnando");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está alimentando-se de uma pequena vegetação");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo rápido");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando na lagoa");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando alto");
    }
    
}