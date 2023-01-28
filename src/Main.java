import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPatricia = new Dev();
        devPatricia.setNome("Patricia");
        devPatricia.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Patrícia" + devPatricia.getConteudosInscritos());

        devPatricia.progredir();
        devPatricia.progredir();
        System.out.println("...");

        System.out.println("Conteudos Inscritos Patrícia" + devPatricia.getConteudosInscritos());
        System.out.println("Conteudos Concluídos Patrícia" + devPatricia.getConteudosConcluidos());
        System.out.println("XP:" + devPatricia.calcularTotalXp());

        System.out.println(".");

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Pedro" + devPedro.getConteudosInscritos());

        devPedro.progredir();
        devPedro.progredir();
        devPedro.progredir();

        System.out.println("Conteudos Concluídos Pedro" + devPedro.getConteudosConcluidos());
        System.out.println("XP:" + devPedro.calcularTotalXp());
    }
}