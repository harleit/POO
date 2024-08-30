import repository.LocalRepository;
import repository.UsuarioRepository;
import service.AvaliacaoService;
import service.LocalService;
import service.UsuarioService;
import view.CommandLineInterface;


public class Main {
    public static void main(String[] args) {
        LocalRepository localRepository = new LocalRepository();
        UsuarioRepository usuarioRepository = new UsuarioRepository();
        LocalService localService = new LocalService(localRepository);
        AvaliacaoService avaliacaoService = new AvaliacaoService(localRepository);
        UsuarioService usuarioService = new UsuarioService(usuarioRepository);
        CommandLineInterface cli = new CommandLineInterface(localService, avaliacaoService, usuarioService);

        cli.iniciar();
    }
}