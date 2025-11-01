package br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.animais;

import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.comportamentos.Predador;

public class Emu extends Ave implements Corredor, Predador {
    public Emu(String nome, int idade) {
        super(nome, idade, "Preto e Branco");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está emitindo um som grave");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo em alta velocidade");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está procurando por insetos e plantas");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está se alimentando de plantas e pequenos insetos");
    }
}