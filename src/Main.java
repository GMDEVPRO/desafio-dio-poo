import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescrcao("descriçao curso java");
        curso1.setCargaHorario(6);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso python");
        curso2.setDescrcao("descriçao curso python");
        curso2.setCargaHorario(8);

        /*como crir polimorfismo
        Conteudo conteudo = new Curso();
        criar list
        List<String> palavras = new ArrayList<>();*/

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescrcao("descriçao mentoria java");
        mentoria.setDate(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Descriçao Bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGuy = new Dev();
        devGuy.setNome("Guy");
        //se ecrever no bootcamp
        devGuy.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos Inscritos Guy" + devGuy.getConteudosInscrito());


        devGuy.progredir();
        System.out.println("-");

        System.out.println("Conteudos Inscritos Guy" + devGuy.getConteudosInscrito());
        System.out.println("Conteudos Concluidos Guy" + devGuy.getConteudosConcluidos());
        System.out.println("xp:" + devGuy.calcularTotalxp());
        System.out.println("*********");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Joao" + devJoao.getConteudosInscrito());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Joao" + devJoao.getConteudosInscrito());
        System.out.println("Conteudos Concluidos  Joao" + devJoao.getConteudosConcluidos());
        System.out.println("xp:" + devJoao.calcularTotalxp());
    }
}