package br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.animais;

import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.comportamentos.Predador;

public class Tartaruga extends Reptil implements Corredor, Predador {
    public Tartaruga(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está grunhindo");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está caminhando lentamente");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está procurando pequenas plantas e algas marinhas");
    }
    
}