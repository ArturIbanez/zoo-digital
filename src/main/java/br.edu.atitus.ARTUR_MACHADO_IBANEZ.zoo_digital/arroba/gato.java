package br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.animais;

import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.comportamentos.Nadador;

public class Gato extends Mamifero implements Nadador,Corredor{

    private String raca;

    public Gato(String nome, int idade, String raca) {
        super(nome, idade, true);
        this.raca = raca;
    }

    
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está miando");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está se alimentando de sua ração de gatos");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo atrás de um ratinho");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está com medo da água");
    }


    public String getRaca() {
        return raca;
    }
    
}