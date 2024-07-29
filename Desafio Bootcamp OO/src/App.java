import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Mentoria de Java");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Anna");

        Dev dev2 = new Dev();
        dev2.setNome("Marcelo");

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Bootcamp Java Developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);
        bootcamp1.getDevsInscritos().add(dev1);
        bootcamp1.getDevsInscritos().add(dev2);

        dev1.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos inscritos: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + dev1.getConteudosInscritos());
        dev1.progredir();

        dev2.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos inscritos: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + dev2.getConteudosInscritos());
        dev2.progredir();

    }
}
