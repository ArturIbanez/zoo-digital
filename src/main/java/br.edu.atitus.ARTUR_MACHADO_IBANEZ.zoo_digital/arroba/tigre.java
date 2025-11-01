package br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.animais;

import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.comportamentos.Predador;

public class Tigre extends Mamifero implements Corredor, Predador {
    public Tigre(String nome, int idade) {
        super(nome, idade, true);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está rosnando");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo atrás de sua caça");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando de maneira sigilosa na floresta fechada");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está se alimentando de sua caça");
    }
}