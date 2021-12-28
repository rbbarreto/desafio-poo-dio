import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso de Java");
        curso1.setDescricao("descricao curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso de JavaScript");
        curso2.setDescricao("descricao curso de JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("curso de Java");
        mentoria.setDescricao("descricao curso de Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp Java Developer");
        bootCamp.setDescricao("Descricao BootCamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Ricardo");
        dev.inscreverBootCamp(bootCamp);
        System.out.println("Conteúdo Inscritos" + dev.getConteudoInscrito());
        dev.progredir();
        System.out.println("Conteúdo Inscritos" + dev.getConteudoInscrito());
        System.out.println("Conteúdo Inscritos" + dev.getConteudosConcluidos());


        Dev dev1 = new Dev();
        dev1.setNome("João");
        dev1.inscreverBootCamp(bootCamp);
        System.out.println("Conteúdo Inscritos" + dev1.getConteudoInscrito());
        dev1.progredir();
        System.out.println("Conteúdo Inscritos" + dev1.getConteudoInscrito());
        System.out.println("Conteúdo Concluidos" + dev.getConteudosConcluidos());




    }
}
