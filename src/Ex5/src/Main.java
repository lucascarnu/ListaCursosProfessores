public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Curso
        Curso cursoJava = new Curso();
        cursoJava.nome = "Java";
        cursoJava.descricao = "Curso de programação em Java";
        cursoJava.professores = new String[]{"Gabriel", "Andres"};
        cursoJava.cargaHoraria = 900;

        Professor professor1 = new Professor();
        professor1.nome = "Gabriel";
        professor1.especialidade = "Java";

        Professor professor2 = new Professor();
        professor2.nome = "Andres";
        professor2.especialidade = "Java Avançado";

        cursoJava.progresso();
        cursoJava.notas();
        cursoJava.participacao();

        System.out.println(professor1.nome + " ensinando " + professor1.especialidade);
        System.out.println(professor2.nome + " ensinando " + professor2.especialidade);
    }
}


