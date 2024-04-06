package model;

import java.util.ArrayList;
import java.util.List;

public class ValidarDocumentosPessoasFisica {

    private List<PessoaFisica> pfComDocumentoValidos = new ArrayList<>();

    private List<PessoaFisica> pfComDocumentoInvalidos = new ArrayList<>();

    public List<PessoaFisica> getValidos() {
        return pfComDocumentoValidos;
    }

    public List<PessoaFisica> getInvalidos() {
        return pfComDocumentoInvalidos;
    }

    public void addPessoaFisica(PessoaFisica pessoaFisica){

        if (pessoaFisica.validaDocumento()){
            pfComDocumentoValidos.add(pessoaFisica);
        }else {
            pfComDocumentoInvalidos.add(pessoaFisica);
        }
    }
}
