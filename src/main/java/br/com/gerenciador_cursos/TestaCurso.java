package br.com.gerenciador_cursos;

import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as colções do java", "Paulo Silveira");
        //javaColecoes.getAulas().add(new Aula("Tabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Tabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
        System.out.println(javaColecoes.getAulas());

    }
}
