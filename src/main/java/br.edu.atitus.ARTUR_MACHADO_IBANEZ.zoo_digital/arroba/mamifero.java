package br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.animais;


public abstract class Mamifero extends Animal {
    private boolean temPelo;

    public Mamifero(String nome, int idade, boolean temPelo) {
        // Chamada ao construtor de Animal
        super(nome, "Mamífero", idade);
        this.temPelo = temPelo;
    }

    public boolean isTemPelo() {
        return temPelo;
    }

    public void setTemPelo(boolean temPelo) {
        this.temPelo = temPelo;
    }

    public void amamentar(){
        System.out.println(this.getNome() + " está amamentando seu filhotinho.");
    }
    
}