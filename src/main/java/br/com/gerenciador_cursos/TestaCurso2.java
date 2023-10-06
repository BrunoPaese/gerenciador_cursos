package br.com.gerenciador_cursos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as colções do java", "Paulo Silveira");
        javaColecoes.adiciona(new Aula("Tabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

        List<Aula> aulasImutaveis = javaColecoes.getAulas(); //por ser imutavel, nao podemos ordenar
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis); //cria "clone" mutavel
        Collections.sort(aulas);
        System.out.println(aulas);

        System.out.println(javaColecoes.getTempoTotal());

        System.out.println(javaColecoes);

    }
}
