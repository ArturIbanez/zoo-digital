package br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.animais;

import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.comportamentos.Predador;

public class Tilapia extends Peixe implements Nadador, Predador {
    public Tilapia(String nome, int idade) {
        super(nome, idade, "doce");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está borbulhando");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando com seu grupo");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está procurando pequenos peixes e algas");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo uma vegetação");
    }
}