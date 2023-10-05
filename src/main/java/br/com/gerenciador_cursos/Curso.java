package br.com.gerenciador_cursos;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas); //retorna uma lista somente leitura, sem seus métodos
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }
}
