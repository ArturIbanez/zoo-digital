package br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.animais;

import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.comportamentos.Nadador;

public class Baleia extends Mamifero implements Nadador{

    public Baleia(String nome, int idade) {
        super(nome, idade, false);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() +  " está cantando");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está filtrando pequenos organismos");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando no vasto oceano");
    }
    
    
    
    
}