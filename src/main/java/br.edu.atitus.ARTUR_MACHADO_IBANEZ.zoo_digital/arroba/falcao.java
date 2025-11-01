package br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.animais;

import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.comportamentos.Voador;
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.comportamentos.Predador;

public class Falcao extends Ave implements Voador, Predador {
    public Falcao(String nome, int idade) {
        super(nome, idade, "Marrom");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está emitindo um som agudo");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando longas distâncias");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando pequenos roedores");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está se alimentando de pequenos roedores");
    }
}