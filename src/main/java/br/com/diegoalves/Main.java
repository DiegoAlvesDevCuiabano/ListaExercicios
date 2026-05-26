package br.com.diegoalves;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        /*
        Exercicio 6
            Crie Pessoa com nome e idade, e metodo apresentar() que imprime os dados.
            Crie Aluno extends
            Pessoa com atributo matricula, e Professor extends Pessoa com atributo
            disciplina. Instancie um
            Aluno e um Professor no main e chame apresentar() em ambos.
        * */

        Aluno aluno = new Aluno();
        aluno.setNome("Diego");
        aluno.setIdade(18);
        aluno.apresentar();

        System.out.println("==================Digievolução==================");

        Professor professor = new Professor();
        professor.setNome("Diego");
        professor.setIdade(29);
        professor.apresentar();


    }
}