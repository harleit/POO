package repository;

import model.Local;

import java.util.ArrayList;
import java.util.List;

public class LocalRepository {
    private List<Local> locais;

    public LocalRepository() {
        this.locais = new ArrayList<>();
    }

    public void adicionarLocal(Local local) {
        locais.add(local);
    }

    public void removerLocal(Local local) {
        locais.remove(local);
    }

    public void editarLocal(Local local) {
        // Implementar lógica de edição
    }

    public List<Local> listarLocais() {
        return locais;
    }

    public Local buscarLocalPorNome(String nome) {
        for (Local local : locais) {
            if (local.getNome().equals(nome)) {
                return local;
            }
        }
        return null;
    }
}
