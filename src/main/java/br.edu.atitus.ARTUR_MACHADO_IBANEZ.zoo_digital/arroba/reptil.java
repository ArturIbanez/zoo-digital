package br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.animais;


public abstract class Reptil extends Animal {
    public Reptil(String nome, int idade) {
        super(nome, "Réptil", idade);
    }
    
    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo como um réptil");
    }
}