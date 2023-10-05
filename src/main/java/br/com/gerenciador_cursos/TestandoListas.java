package br.com.gerenciador_cursos;

import java.util.ArrayList;

public class TestandoListas {

    public static void main(String[] args) {
        String aula1 = "conhecendo mais de listas";
        String aula2 = "modelando a classe aula";
        String aula3 = "trabalhando com cursos e sets";

        ArrayList<String> aulas = new ArrayList<>();

        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }

        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("Aula: " + aulas.get(i));
        }

        aulas.forEach(aula -> {
            System.out.println("Percorrendo");
            System.out.println("Aula: " + aula);
        });
    }
}
