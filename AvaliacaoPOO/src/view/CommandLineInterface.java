package view;

import model.Avaliacao;
import model.Local;
import service.AvaliacaoService;
import service.LocalService;
import service.UsuarioService;

import java.util.Scanner;

public class CommandLineInterface {
    private LocalService localService;
    private AvaliacaoService avaliacaoService;
    private UsuarioService usuarioService;
    private Scanner scanner;

    public CommandLineInterface(LocalService localService, AvaliacaoService avaliacaoService, UsuarioService usuarioService) {
        this.localService = localService;
        this.avaliacaoService = avaliacaoService;
        this.usuarioService = usuarioService;
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        while (true) {
            System.out.println("1. Adicionar Local");
            System.out.println("2. Remover Local");
            System.out.println("3. Listar Locais");
            System.out.println("4. Buscar Local por Nome");
            System.out.println("5. Adicionar Avaliação");
            System.out.println("6. Remover Avaliação");
            System.out.println("7. Editar Avaliação");
            System.out.println("8. Sair");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (escolha) {
                case 1:
                    adicionarLocal();
                    break;
                case 2:
                    removerLocal();
                    break;
                case 3:
                    listarLocais();
                    break;
                case 4:
                    buscarLocalPorNome();
                    break;
                case 5:
                    adicionarAvaliacao();
                    break;
                case 6:
                    removerAvaliacao();
                    break;
                case 7:
                    editarAvaliacao();
                    break;
                case 8:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Escolha inválida.");
            }
        }
    }

    private void adicionarLocal() {
        System.out.println("Nome do Local:");
        String nome = scanner.nextLine();
        System.out.println("Endereço:");
        String endereco = scanner.nextLine();
        System.out.println("Zona:");
        String zona = scanner.nextLine();
        System.out.println("Cidade:");
        String cidade = scanner.nextLine();
        System.out.println("Estado:");
        String estado = scanner.nextLine();
        System.out.println("País:");
        String pais = scanner.nextLine();

        Local local = new Local(nome, endereco, zona, cidade, estado, pais);
        localService.adicionarLocal(local);
        System.out.println("Local adicionado com sucesso!");
    }

    private void removerLocal() {
        System.out.println("Nome do Local a ser removido:");
        String nome = scanner.nextLine();
        Local local = localService.buscarLocalPorNome(nome);
        if (local != null) {
            localService.removerLocal(local);
            System.out.println("Local removido com sucesso!");
        } else {
            System.out.println("Local não encontrado.");
        }
    }

    private void listarLocais() {
        for (Local local : localService.listarLocais()) {
        	System.out.printf("\nLocal: %s, %s, Zona %s de %s - %s, %s\n", 
        		    local.getNome(),
        		    local.getEndereco(),
        		    local.getZona(),
        		    local.getCidade(), 
        		    local.getEstado(), 
        		    local.getPais()
        		);
        		System.out.printf("Avaliações: %s\n\n", local.getAvaliacoes());
        }
    }

    private void buscarLocalPorNome() {
        System.out.println("Nome do Local:");
        String nome = scanner.nextLine();
        Local local = localService.buscarLocalPorNome(nome);
        if (local != null) {
            System.out.printf("Local: ",local.getNome(),"Em: ",local.getCidade(),"-",local.getEstado(),", ",local.getPais(),"\n");
            System.out.printf("Avaliações: ",local.getAvaliacoes());
        } else {
            System.out.println("Local não encontrado.");
        }
    }

    private void adicionarAvaliacao() {
        System.out.println("Nome do Local:");
        String nome = scanner.nextLine();
        Local local = localService.buscarLocalPorNome(nome);
        if (local != null) {
            System.out.println("Nota (1 a 5):");
            int nota = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha
            System.out.println("Comentário:");
            String comentario = scanner.nextLine();

            Avaliacao avaliacao = new Avaliacao(nota, comentario);
            avaliacaoService.adicionarAvaliacao(local, avaliacao);
            System.out.println("Avaliação adicionada com sucesso!");
        } else {
            System.out.println("Local não encontrado.");
        }
    }

    private void removerAvaliacao() {
        System.out.println("Nome do Local:");
        String nome = scanner.nextLine();
        Local local = localService.buscarLocalPorNome(nome);
        if (local != null) {
            System.out.println("Comentário da Avaliação a ser removida:");
            String comentario = scanner.nextLine();
            Avaliacao avaliacaoARemover = null;
            for (Avaliacao avaliacao : local.getAvaliacoes()) {
                if (avaliacao.getComentario().equals(comentario)) {
                    avaliacaoARemover = avaliacao;
                    break;
                }
            }
            if (avaliacaoARemover != null) {
                avaliacaoService.removerAvaliacao(local, avaliacaoARemover);
                System.out.println("Avaliação removida com sucesso!");
            } else {
                System.out.println("Avaliação não encontrada.");
            }
        } else {
            System.out.println("Local não encontrado.");
        }
    }

    private void editarAvaliacao() {
        System.out.println("Nome do Local:");
        String nome = scanner.nextLine();
        Local local = localService.buscarLocalPorNome(nome);
        if (local != null) {
            System.out.println("Comentário da Avaliação a ser editada:");
            String comentarioAntigo = scanner.nextLine();
            Avaliacao avaliacaoAntiga = null;
            for (Avaliacao avaliacao : local.getAvaliacoes()) {
                if (avaliacao.getComentario().equals(comentarioAntigo)) {
                    avaliacaoAntiga = avaliacao;
                    break;
                }
            }
            if (avaliacaoAntiga != null) {
                System.out.println("Nova Nota (1 a 5):");
                int novaNota = scanner.nextInt();
                scanner.nextLine(); // Consumir nova linha
                System.out.println("Novo Comentário:");
                String novoComentario = scanner.nextLine();

                Avaliacao avaliacaoNova = new Avaliacao(novaNota, novoComentario);
                avaliacaoService.editarAvaliacao(local, avaliacaoAntiga, avaliacaoNova);
                System.out.println("Avaliação editada com sucesso!");
            } else {
                System.out.println("Avaliação não encontrada.");
            }
        } else {
            System.out.println("Local não encontrado.");
        }
    }
}
