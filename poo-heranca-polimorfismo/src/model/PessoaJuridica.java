package model;

public class PessoaJuridica extends Pessoa {

    double aliquota;

    public boolean validaDocumento(){

        String documentoValidar = getDocumento();

        if(!super.validaDocumento()){
            return false;
        }

        if (documentoValidar.length() != 14){
            return false;
        }
        return true;

    }

    public double getAliquota() {
        return aliquota;
    }

    public void setAliquota(double aliquota) {
        this.aliquota = aliquota;
    }
}
