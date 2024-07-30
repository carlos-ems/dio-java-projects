package com.projeto;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java Basico", "Curso de Java basico", 8);
        Curso curso2 = new Curso("Spring Boot", "Curso de introducao ao Spring Boot", 5);

        Mentoria mentoria1 = new Mentoria("Mentoria de Carreira", "Mentoria para desenvolvimento de carreira", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev("Carlos");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Carlos: " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Carlos: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Carlos: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        Dev dev2 = new Dev("Pedro");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Pedro: " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Pedro: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Pedro: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());
    }
}