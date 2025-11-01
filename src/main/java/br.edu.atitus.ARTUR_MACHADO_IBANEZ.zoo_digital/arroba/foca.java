package br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.animais;

import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.comportamentos.Predador;

public class Foca extends Mamifero implements Nadador, Predador {
    public Foca(String nome, int idade) {
        super(nome, idade, false);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está grunindo");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando nas águas geladas");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando pequenos mariscos");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo pequenos mariscos");
    }
}