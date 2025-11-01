package br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.animais;


public class PeixePalhaço extends Peixe {

    public PeixePalhaço(String nome, int idade) {
        super(nome, idade, "Salgada");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está borbulhando");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo pequenas algas marinhas");
    }
    
    
}