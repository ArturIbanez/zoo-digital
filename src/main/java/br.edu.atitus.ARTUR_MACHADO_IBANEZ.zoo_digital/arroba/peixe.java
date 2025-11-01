package br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.animais;


public abstract class Peixe extends Animal {
    private String tipoAgua; //Água doce ou salgada

    public Peixe(String nome, int idade, String tipoAgua) {
        // Chamada ao construtor de Animal
        super(nome, "Peixe", idade);
        this.tipoAgua = tipoAgua;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }


    
    
}