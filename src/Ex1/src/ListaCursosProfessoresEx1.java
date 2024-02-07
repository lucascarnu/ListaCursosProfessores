import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
// Ex1
public class ListaCursosProfessoresEx1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        List<String> listaCursos = new ArrayList<>();
        List<String> listaProfessores = new ArrayList<>();

        exibirMensagemInicial();

        while (true) {
            System.out.print("Digite o nome do curso (ou 0 para sair): ");
            String curso = entrada.nextLine();

            if (curso.equals("0")) {
                break;
            }

            adicionarCurso(listaCursos, curso);

            System.out.print("Digite o nome do professor do curso " + curso + " (ou 0 para sair): ");
            String professor = entrada.nextLine();

            if (professor.equals("0")) {
                break;
            }

            adicionarProfessor(listaProfessores, professor);
        }

        System.out.println("*** Lista de Cursos e Professores ***");
        exibirListaCursosProfessores(listaCursos, listaProfessores);
    }

    private static void exibirMensagemInicial() {
        System.out.println("Bem vindo à lista de Cursos e Professores Ex1");
    }

    private static void exibirListaCursosProfessores(List<String> cursos, List<String> professores) {
        if (!cursos.isEmpty() && !professores.isEmpty()) {
            System.out.println("Cursos\t\tProfessores");
            for (int i = 0; i < cursos.size() && i < professores.size(); i++) {
                System.out.println(cursos.get(i) + "\t\t" + professores.get(i));
            }
        } else {
            System.out.println("Sem cadastros");
        }
    }

    private static void adicionarCurso(List<String> lista, String curso) {
        lista.add(curso);
    }

    private static void adicionarProfessor(List<String> lista, String professor) {
        lista.add(professor);
    }
}

