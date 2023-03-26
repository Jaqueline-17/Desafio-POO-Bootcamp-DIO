package com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
    
        Curso curso1 = new Curso();
       
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descição curso de java");
        curso1.setCargaHoraria(8);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("descição curso de JavaScript");
        curso2.setCargaHoraria(4);
        
        // System.out.println(curso1);
        // System.out.println(curso2);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("João");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("==========");
        System.out.println("Conteúdos Inscritos: " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("==========");
        System.out.println("Conteúdos Inscritos: " + dev1.getConteudosInscritos());
        System.out.println(".");
        System.out.println("Conteúdos Concluídos: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularXp());

        Dev dev2 = new Dev();
        dev2.setNome("Maria");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("==========");
        System.out.println("Conteúdos Inscritos: " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("==========");
        System.out.println("Conteúdos Inscritos: " + dev2.getConteudosInscritos());
        System.out.println(".");
        System.out.println("Conteúdos Concluídos: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularXp());
    }
}