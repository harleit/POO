package model;

import java.util.ArrayList;
import java.util.List;

public class ValidarDocumentosPessoaJuridica {

    private List<PessoaJuridica> pjComDocumentoValidos = new ArrayList<>();

    private List<PessoaJuridica> pjComDocumentoInvalidos = new ArrayList<>();

    public List<PessoaJuridica> getValidos() {
        return pjComDocumentoValidos;
    }

    public List<PessoaJuridica> getInvalidos() {
        return pjComDocumentoInvalidos;
    }

    public void addPessoaJuridica(PessoaJuridica pessoaJuridica){

        if (pessoaJuridica.validaDocumento()){
            pjComDocumentoValidos.add(pessoaJuridica);
        }else {
            pjComDocumentoInvalidos.add(pessoaJuridica);
        }
    }
}
