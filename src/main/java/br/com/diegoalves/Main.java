package br.com.diegoalves;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        /*
        Exercicio 5
            Crie uma classe Veiculo com atributos marca e ano, construtor, e metodo
            ligar() que imprime uma
            mensagem. Depois crie Carro que herda de Veiculo e adiciona o
            atributo numPortas. No construtor
            do Carro, use super(). Crie um Carro no main e chame ligar().
        * */

        Carro carro = new Carro("Carro A", "A");
        carro.ligar();
    }
}