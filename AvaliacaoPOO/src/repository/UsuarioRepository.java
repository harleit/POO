package repository;

import model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository {
    private List<Usuario> usuarios;

    public UsuarioRepository() {
        this.usuarios = new ArrayList<>();
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void removerUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }

    public Usuario buscarUsuarioPorNome(String nome) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equals(nome)) {
                return usuario;
            }
        }
        return null;
    }
}
