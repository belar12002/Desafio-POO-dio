import br.com.desafio.dio.dominio.Bootcamp;
import br.com.desafio.dio.dominio.Curso;
import br.com.desafio.dio.dominio.Dev;
import br.com.desafio.dio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);
//        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso c#");
        curso2.setDescricao("descrição curso c#");
        curso2.setCargaHoraria(6);
//        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos:" + devPedro.getConteudosInscritos());
        devPedro.progredir();
        System.out.println("Conteudos inscritos:" + devPedro.getConteudosInscritos());
        System.out.println("Conteudos concluidos:" + devPedro.getConteudosConcluidos());
        System.out.println("XP: " + devPedro.calcularTotalXp());

        System.out.println("----------------------------------------");

        Dev devAlice =  new Dev();
        devAlice.setNome("Alice");
        devAlice.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos:" + devAlice.getConteudosInscritos());
        devAlice.progredir();
        System.out.println("Conteudos inscritos:" + devAlice.getConteudosInscritos());
        System.out.println("Conteudos concluidos:" + devAlice.getConteudosConcluidos());
        System.out.println("XP: " + devPedro.calcularTotalXp());


    }


}
