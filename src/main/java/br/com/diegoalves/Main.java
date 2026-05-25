package br.com.diegoalves;

public class Main {
    public static void main(String[] args) {
        /*
        Exercicio 3
            Declare dois Integer com valor 127 e compare com ==.
            Depois declare dois Integer com valor 200 e
            compare com == e com .equals(). Explique a diferenca.
        * */

        Integer a = 127;
        Integer b = 127;

        System.out.println(a == b);
        Integer c = 200;
        Integer d = 200;
        System.out.println("=============Pulando linha============");
        System.out.println(c == d);
        System.out.println(c.equals(d));
    }
}