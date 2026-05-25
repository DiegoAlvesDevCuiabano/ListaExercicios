package br.com.diegoalves;

public class Main {
    public static void main(String[] args) {
        /*
        * Exercicio 1
            Crie uma classe com main que declare uma variavel int nota = 8 e
            * uma variavel Integer notaObj =
            nota. Imprima ambas e imprima o tipo da notaObj
            * usando getClass().getSimpleName().
        * */

        int nota = 8;
        Integer notaObj = nota;

        System.out.println("Nota: " + nota);
        System.out.println("NotaObj: " + notaObj);
        System.out.println("O tipo é " + notaObj.getClass().getSimpleName());
    }
}