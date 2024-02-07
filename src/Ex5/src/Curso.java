public class Curso {

    String nome;
    String descricao;
    String[] professores;
    int cargaHoraria;

//Obs.: Os métodos podem conter apenas textos que imprimam no console
    public void progresso() {
        System.out.println("Verificando o progresso do curso: " + nome);

    }

    public void notas() {
        System.out.println("Verificando as notas do curso: " + nome);

    }

    public void participacao() {
        System.out.println("Verificando a participação dos alunos no curso: " + nome);

    }
}
