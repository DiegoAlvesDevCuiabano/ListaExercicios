package br.com.diegoalves;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        /*
        Exercicio 4
        Uma loja vende um produto por R$ 49.90 e o cliente comprou 3 unidades com 5%
        de desconto.
        Calcule o total usando BigDecimal (nao use double). Lembre:
        sempre passe String no construtor.
        * */

        BigDecimal produto = new BigDecimal("49.90");

        BigDecimal desconto = produto.multiply(new BigDecimal("0.05"));

        BigDecimal valorTotal = produto.multiply(new BigDecimal("3"));

        BigDecimal descontoTotal = desconto.multiply(new BigDecimal("3"));

        BigDecimal produtoTotal = valorTotal.subtract(descontoTotal);

        System.out.println("Produto Total: " + produtoTotal);
    }
}