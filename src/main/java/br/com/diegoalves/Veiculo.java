package br.com.diegoalves;

public class Veiculo {
    private String marca;
    private String ano;

    public Veiculo(String marca, String ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public void ligar() {
        System.out.println("Carro ligado");
    }
}
