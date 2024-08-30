package service;

import model.Usuario;
import repository.UsuarioRepository;

public class UsuarioService {
    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarioRepository.adicionarUsuario(usuario);
    }

    public void removerUsuario(Usuario usuario) {
        usuarioRepository.removerUsuario(usuario);
    }

    public Usuario buscarUsuarioPorNome(String nome) {
        return usuarioRepository.buscarUsuarioPorNome(nome);
    }
}
