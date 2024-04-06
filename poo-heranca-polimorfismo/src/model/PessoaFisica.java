package model;

public class PessoaFisica extends Pessoa {

    double peso;
    double altura;

    public boolean validaDocumento(){

        String documentoValidar = getDocumento();

        if(!super.validaDocumento()){
            return false;
        }

        if (documentoValidar.length() != 11){
            return false;
        }
        return true;

    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
