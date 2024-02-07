import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaCursosProfessoresEx4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        List<String> listaCursos = new ArrayList<>();
        List<String> listaProfessores = new ArrayList<>();
        List<String> listaConcluidos = new ArrayList<>(); // Ex4: Nova lista para cursos concluídos

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
                case 3:
                    removerItem(listaCursos, "curso", entrada);
                    removerItem(listaProfessores, "professor", entrada);
                    break;
                case 4: // Ex4: Adicionando a opção de marcar como concluído
                    marcarComoConcluido(listaCursos, listaConcluidos, entrada);
                    break;
                case 5: // Ex4: Adicionando a opção de listar concluídos
                    System.out.println("*** Cursos Concluídos ***");
                    exibirLista(listaConcluidos);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        entrada.close();
    }

    private static void exibirMensagemInicial() {
        System.out.println("Bem-vindo à lista de Cursos e Professores Ex4");
    }

    private static void exibirMenu() {
        System.out.println("\nOpções:");
        System.out.println("(1) Listar");
        System.out.println("(2) Adicionar");
        System.out.println("(3) Remover");
        System.out.println("(4) Marcar como concluído"); // Ex4: Adicionando a nova opção
        System.out.println("(5) Listar concluídos"); // Ex4: Adicionando a nova opção
        System.out.println("(0) Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void exibirListaCursosProfessores(List<String> cursos, List<String> professores) {
        if (!cursos.isEmpty() && !professores.isEmpty()) {
            System.out.println("Cursos\t\t\tProfessores");
            for (int i = 0; i < cursos.size() && i < professores.size(); i++) {
                System.out.println((i + 1) + ". " + cursos.get(i) + "\t\t\t" + professores.get(i));
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

    private static void removerItem(List<String> lista, String tipo, Scanner entrada) {
        if (lista.isEmpty()) {
            if (tipo.equals("curso")) {
                System.out.println("Lista de cursos vazia.");
            } else {
                System.out.println("Lista de professores vazia.");
            }
            return;
        }

        System.out.println("Escolha o " + tipo + " que deseja remover:");
        int indice = listarPedirIndice(lista, entrada);

        if (indice >= 1 && indice <= lista.size()) {
            lista.remove(indice - 1);
            System.out.println(tipo.substring(0, 1).toUpperCase() + tipo.substring(1) + " removido com sucesso.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    private static void marcarComoConcluido(List<String> listaCursos, List<String> listaConcluidos, Scanner entrada) {
        if (listaCursos.isEmpty()) {
            System.out.println("Lista de cursos vazia.");
            return;
        }

        System.out.println("Escolha o curso que deseja marcar como concluído:");
        int indice = listarPedirIndice(listaCursos, entrada);

        if (indice >= 1 && indice <= listaCursos.size()) {
            String cursoConcluido = listaCursos.get(indice - 1);
            listaConcluidos.add(cursoConcluido);
            listaCursos.remove(indice - 1);
            System.out.println("Curso marcado como concluído com sucesso.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    private static void exibirLista(List<String> lista) {
        System.out.println("Índice\tItem");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + "\t" + lista.get(i));
        }
    }

    private static int listarPedirIndice(List<String> lista, Scanner entrada) {
        exibirLista(lista);
        System.out.print("Digite o número correspondente ao item: ");
        return entrada.nextInt();
    }
}

