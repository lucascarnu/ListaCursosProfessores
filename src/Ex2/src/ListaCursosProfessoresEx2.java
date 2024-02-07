import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
// Ex2
public class ListaCursosProfessoresEx2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        List<String> listaCursos = new ArrayList<>();
        List<String> listaProfessores = new ArrayList<>();

        exibirMensagemInicial();

        int opcao;
        do {
            exibirMenu();
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("*** Lista de Cursos e Professores ***");
                    exibirListaCursosProfessores(listaCursos, listaProfessores);
                    break;
                case 2:
                    adicionarCurso(listaCursos, entrada);
                    adicionarProfessor(listaProfessores, entrada);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);


    }

    private static void exibirMensagemInicial() {
        System.out.println("Bem-vindo à lista de Cursos e Professores Ex2");
    }

    private static void exibirMenu() {
        System.out.println("\nOpções:");
        System.out.println("(1) Listar");
        System.out.println("(2) Adicionar");
        System.out.println("(0) Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void exibirListaCursosProfessores(List<String> cursos, List<String> professores) {
        if (!cursos.isEmpty() && !professores.isEmpty()) {
            System.out.println("Cursos\t\tProfessores");
            for (int i = 0; i < cursos.size() && i < professores.size(); i++) {
                System.out.println((i) + ". " + cursos.get(i) + "\t\t" + professores.get(i));
            }
        } else {
            System.out.println("Sem cadastros");
        }
    }

    private static void adicionarCurso(List<String> lista, Scanner entrada) {
        System.out.print("Digite o nome do curso: ");
        String curso = entrada.nextLine();
        lista.add(curso);
    }

    private static void adicionarProfessor(List<String> lista, Scanner entrada) {
        System.out.print("Digite o nome do professor: ");
        String professor = entrada.nextLine();
        lista.add(professor);
    }
}

